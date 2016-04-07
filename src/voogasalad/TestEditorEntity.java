package voogasalad;

import java.util.Arrays;

import model.component.movement.Orientation;
import model.component.movement.Position;
import model.component.movement.Velocity;
import model.entity.Entity;
import model.entity.EntitySystem;

import org.junit.Test;

import view.EditorEntity;

public class TestEditorEntity {
	@Test
	public void testThatEditorIsCreated(){
		Entity entity = new Entity(0);
		EditorEntity editor = new EditorEntity(entity);
	}
	
	@Test
	public void testThatEditorCreatesGuiObjectsForAllComponents(){
		Entity entity = new Entity(0);
		EntitySystem system = new EntitySystem();
		system.addEntity(entity);
		entity.addComponents(Arrays.asList(new Orientation(), new Position(), new Velocity()));
		EditorEntity editor = new EditorEntity(entity);
		
	}
}
