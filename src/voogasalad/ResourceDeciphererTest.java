package voogasalad;

import static org.junit.Assert.*;

import org.junit.Test;

public class ResourceDeciphererTest {

	@Test
	public void testIsImage() {
		assertEquals("Should be an image", true, ResourceDecipherer.isImage("hello.png"));
		assertEquals("Should be an image", true, ResourceDecipherer.isImage("C:\\User\\Programs\\hello.gif"));
		assertEquals("Should be an image", true, ResourceDecipherer.isImage("file:/../hello.bmp"));
		assertEquals("Should be an image", false, ResourceDecipherer.isImage("hello.wav"));
		assertEquals("Should be an image", false, ResourceDecipherer.isImage("hello.jpgg"));
	}
	
	@Test
	public void testIsAudio() {
		assertEquals("Should be an audio", true, ResourceDecipherer.isAudio("hello.wav"));
		assertEquals("Should be an audio", true, ResourceDecipherer.isAudio("C:\\User\\Programs\\hello.mp3"));
		assertEquals("Should be an audio", true, ResourceDecipherer.isAudio("file:/../hello.wav"));
		assertEquals("Should be an audio", false, ResourceDecipherer.isAudio("hello.flv"));
		assertEquals("Should be an audio", false, ResourceDecipherer.isAudio("hello..png"));
	}

}
