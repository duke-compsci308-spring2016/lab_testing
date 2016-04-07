package voogasalad;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import engine.ILevel;
import engine.Level;
import engine.sprite.ISprite;
import engine.sprite.Sprite;
import gameauthoring.levels.sprites.SpriteController;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import util.Coordinate;

public class SpriteControllerTest {
    
    ObjectProperty<ILevel> level;
    SpriteController controller;
    
    @Before
    public void setup () {
        level = new SimpleObjectProperty<>(new Level());
        controller = new SpriteController(level.get());
    }

    @Test
    public void testMoveSprite () {
        ObjectProperty<ISprite> sprite = new SimpleObjectProperty<>(new Sprite());
        controller.moveSprite(sprite, 5, 5);
        Coordinate point = sprite.get().getLocation().get();
        assertEquals(5, point.getX(), .01);
        assertEquals(5, point.getY(), .01);
    }
    
    @Test
    public void testSpriteDelete() {
        ObjectProperty<ISprite> sprite = new SimpleObjectProperty<>(new Sprite());
        level.get().add(sprite.get(), new Coordinate(0,0));
        controller.deleteSprite(sprite);
        assertEquals(0, level.get().getSprites().size());
    }

}
