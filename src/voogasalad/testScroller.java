package voogasalad;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.Node;
import javafx.scene.image.ImageView;

import org.junit.Test;

public class testScroller {
	
	@Test
	public void testCenterScroll() {
		List<Node> myList = new ArrayList<>();
		int screensize = 600;
		
		Node first = new ImageView();
		first.setLayoutX(1000);
		Node second = new ImageView();
		second.setLayoutX(200);
		Node third = new ImageView();
		third.setLayoutX(500);
		
		myList.add(first);
		myList.add(second);
		myList.add(third);
		
		DisplayScroller scroll = new DisplayScroller(screensize);
		List<Node> newList = scroll.centerScroll(myList, 100);

		assertEquals(2, newList.size());
	}

}
