package voogasalad.rhondu;

import com.google.common.base.Preconditions;
import javafx.beans.property.SimpleObjectProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;


/**
 * This is the interface for all components, which hold data.
 *
 * @author Rhondu Smithwick, Tom Wu
 */
public interface IComponent {

    /**
     * Returns if only one of this component is allowed.
     *
     * @return whether only one of these components is allowed for an Entity
     */
    @Deprecated
    default boolean unique() {
        return false;
    }

    /**
     * Gets any properties this component holds.
     *
     * @return all the properties this coompoennt holds
     */
    default List<SimpleObjectProperty<?>> getProperties() {
        return Collections.emptyList();
    }

    /**
     * Gets a specific property with specified value class and with specified name.
     * <p>
     * Example call for a position:
     * SimpleObjectProperty$Double$ x = position.getProperty(Double, "X");
     *
     * @param propertyClass the class of the property's held value
     * @param name          the name of property
     * @param <T>           the type of the property's held value
     * @return specific property of specified class and with name
     * @throws IllegalArgumentException if incorrect propertyClass or no property with this name is present
     */
    @SuppressWarnings({"unchecked", "OptionalGetWithoutIsPresent"})
    default <T> SimpleObjectProperty<T> getProperty(Class<T> propertyClass, String name) throws IllegalArgumentException {
        Predicate<SimpleObjectProperty<?>> isRight = (s) -> (Objects.equals(s.getName(), name));
        Optional<SimpleObjectProperty<?>> rightProperty = getProperties().stream().filter(isRight).findFirst();
        boolean hasProperty = rightProperty.isPresent();
        Preconditions.checkArgument(hasProperty, "No such property with this name is present");
        boolean rightClass = propertyClass.isInstance(rightProperty.get().get());
        Preconditions.checkArgument(rightClass, "Incorrect value class");
        return (SimpleObjectProperty<T>) rightProperty.get();
    }

    /**
     * Get a map, where each entry is a component name to it's value class.
     *
     * @return a map, where each entry is a component name to it's value class
     */
    default Map<String, Class<?>> getPropertyNamesAndClasses() {
        Map<String, Class<?>> nameCLassMap = new HashMap<>();
        for (SimpleObjectProperty<?> property : getProperties()) {
            nameCLassMap.put(property.getName(), property.get().getClass());
        }
        return nameCLassMap;
    }

    /**
     * Return the class to put into an entity map.
     *
     * @return the class to be put into an Entity map
     */
    default Class<? extends IComponent> getClassForComponentMap() {
        return getClass();
    }
}
