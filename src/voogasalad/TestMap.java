package voogasalad;

import static org.junit.Assert.*;

import org.junit.Test;
import voogasalad.Map;

public class TestMap {

	Map myMap;
	private void setUp(int size) {
		myMap = new Map(size);
	}
	
	@Test
	public void testStore(){
		setUp(5);
		myMap.store(0, 0, "something");
		assertEquals("Stored incorrectly", "something", myMap.get(0, 0));
	}
	
	@Test
	public void testSize(){
		setUp(6);
		assertEquals("Size is wrong", 6, myMap.size());
		setUp(7);
		assertEquals("Size is wrong", 7, myMap.size());
		setUp(8);
		assertEquals("Size is wrong", 8, myMap.size());
		setUp(9);
		assertEquals("Size is wrong", 9, myMap.size());
		setUp(1234);
		assertEquals("Size is wrong", 1234, myMap.size());
		
	}
	
	@Test
	public void testOutOfBounds(){
		setUp(3);
		myMap.get(4, 4);
		myMap.store(4, 4, "something");
	}

}
