package com.dvops.maven.eclipse;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MouseCollectionTest {
	
	private mouseCollection sc;
	private Mouse s1;
	private Mouse s2;
	private Mouse s3;
	
	private final int MOUSE_COLLECTION_SIZE = 3;

	@BeforeEach
	void setUp() throws Exception {
		sc = new mouseCollection();
		s1 = new Mouse( 
				"Razer DeathAdder V2",
				"Wired [USB]",
				"6",
				"20,000",
				"82g",
				"127.0 mm / 72.7 mm / 42.7 mm",
				"$119.90",
				"4.5",
				"https://cdn.mos.cms.futurecdn.net/oKG8af4ZbJqjttMd2jKGzZ-970-80.jpg.webp",
				"Designed to dominate in MMO, Battle Royale, FPS, and more, the multi-genre "
				+ "master returns stronger than ever. With 3 swappable side plates, 19+1 programmable buttons, "
				+ "a Razer HyperScroll Pro Wheel, and Razer HyperSpeed Wireless, the Razer Naga V2 Pro packs the"
				+ " power to rise above every genre. The Razer Naga V2 Pro comes with a set of 12, 6 and 2-button"
				+ " magnetic side plates, allowing you adapt to any game genre with up to 22 programmable "
				+ "controls. The overall design of Naga Pro stays close to the Trinity but has gained a bit of "
				+ "weight to accommodate the new tech. The Naga Pro is 7mm wider and heavier than the Trinity at"
				+ " 117g, but thanks to the 100% PTFE feet, it glides smoothly across most surfaces. The bigger"
				+ " mouse also takes some getting used to; requiring my long hands to adopt a full palm grip. "
				+ "But the contoured mouse buttons and a rest for my ring finger make it easier to hold onto. "
				+ "Textured rubber grips for the thumb and pinky also help."
				);
		s2 = new Mouse (
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
		s3 = new Mouse (
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
		sc.postMouses(s1);
		sc.postMouses(s2);
		sc.postMouses(s3);
	}

	@Test
	void testAddMouses() {
		List<Mouse> testSc = sc.getMouses();
		sc.postMouses(s1);
	}
	
	void testGetMouses() {
		List<Mouse> testSc = sc.getMouses();
		sc.postMouses(s1);
	}
	
	void testGetMouseByName() {
		
	}

}
