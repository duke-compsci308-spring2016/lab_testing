package voogasalad.rhondu;

import javafx.beans.property.SimpleObjectProperty;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by rhondusmithwick on 4/7/16.
 *
 * @author Rhondu Smithwick
 */
public class VelocityTest {

    @Test
    public void testInput() {
        double speed = 800;
        double direction = 20;
        final Velocity velocity = new Velocity(speed, direction);
        assertEquals(velocity.getSpeed(), speed, .001);
        assertEquals(velocity.getDirection(), direction, .001);
    }

    @Test
    public void testSet() {
        double inSpeed = 800;
        double inDirection = 20;
        final Velocity velocity = new Velocity(inSpeed, inDirection);
        double newSpeed = 100000;
        velocity.setSpeed(newSpeed);
        assertEquals(velocity.getSpeed(), newSpeed, .001);
        double newDirection = 4000;
        velocity.setDirection(newDirection);
        assertEquals(velocity.getDirection(), newDirection, .001);
    }

    @Test
    public void testProperties() {
        double inSpeed = 800;
        double inDirection = 20;
        final Velocity velocity = new Velocity(inSpeed, inDirection);
        SimpleObjectProperty<Double> speed = velocity.getProperty(Double.class, "Speed");
        SimpleObjectProperty<Double> speedCheck = velocity.speedProperty();
        assertEquals(speed, speedCheck);
    }

    @Test
    public void testPropertiesMap() {
        Map<String, Class<?>> testMap = new HashMap<>();
        testMap.put("Speed", Double.class);
        testMap.put("Direction", Double.class);
        double inSpeed = 800;
        double inDirection = 20;
        final Velocity velocity = new Velocity(inSpeed, inDirection);
        Map<String, Class<?>> velocityMap = velocity.getPropertyNamesAndClasses();
        assertEquals(testMap, velocityMap);
    }
}
