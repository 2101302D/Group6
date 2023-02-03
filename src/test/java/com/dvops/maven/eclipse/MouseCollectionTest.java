package com.dvops.maven.eclipse;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MouseCollectionTest {
	
	private mouseCollection mc;
	private Mouse m1;
	private Mouse m2;
	private Mouse m3;
	
	/*private final int MOUSE_COLLECTION_SIZE = 3;*/

	@BeforeEach
	void setUp() throws Exception {
		mc = new mouseCollection();
		m1 = new Mouse( 
				"Razer DeathAdder V2",
				"Wired [USB]",
				"6",
				"20,000",
				"82g",
				"127.0 mm / 72.7 mm / 42.7 mm",
				"$119.90",
				"4.5",
				"https://cdn.mos.cms.futurecdn.net/oKG8af4ZbJqjttMd2jKGzZ-970-80.jpg.webp",
				"Designed to dominate in MMO, Battle Royale, FPS, and more, the multi-genre master returns stronger than ever."
				);
		m2 = new Mouse (
				"Logitech G203 Lightsync",
				"Wired [USB]",
				"5",
				"8,000",
				"85g (3.0oz)",
				"116.6 mm / 62.15 mm / 38.2 mm",
				"$59",
				"4.5",
				"https://cdn.mos.cms.futurecdn.net/BLUvfLpuxjut6JBS7Qf73C.jpg",
				" "
				);
		m3 = new Mouse (
				"Razer Naga Pro",
				"Wireless, Wired [USB], Bluetooth",
				"3 swappable side plates with up to 19+1 programmable buttons",
				"20,000",
				"117g (4.1oz)",
				"119.0 mm / 74.5 mm / 43.0 mm",
				"$59",
				"4.5",
				"https://cdn.mos.cms.futurecdn.net/FsYiy2ZBVwhAPeUxJj63NE-970-80.jpg.webp",
				" "
				);
		mc.postMouses(m1);
		mc.postMouses(m2);
		mc.postMouses(m3);
	}

	@Test
	void testAddMouses() {
		mc.postMouses(m1);
		List<Mouse> testMc = mc.getMouses();
	}
	
	@Test
	void testGetMouses() {
		List<Mouse> testMc = mc.getMouses();
	}
	
	@Test
	void testGetMouseByName() {
        Mouse testMc = mc.getByName("Razer DeathAdder Essential");
	}

}
