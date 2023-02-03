package com.dvops.maven.eclipse;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class KeyboardCollectionTest {
	
	private keyboardCollection kc;
	private keyboard k1;
	private keyboard k2;
	private keyboard k3;

	@BeforeEach
	void setUp() throws Exception {
			kc = new keyboardCollection();
			k1 = new keyboard("Wooting Two HE", "Lekker (Gateron) / Linear Switches", "Full size", "RGB LED", "None", "PBT", 239, 4.5, "https://uploads-ssl.webflow.com/612ca8920bc3a648125ffac3/623207cf3b77e02a8e6a1564_Wooting-two-HE-min.png");
			k2 = new keyboard("Mountain Everest Max","Cherry MX Red, Blue, Brown, Silver", "Full size or TKL", "Per-key RGB", "USB 3.2 Gen1", "ABS", 250, 4.5, "https://mountain.gg/assets/Mountain-Everest-Max-Gunmetal-Gray-45-RGB.png");
			k3 = new keyboard("HITIME XVX M61", "Gateron Yellow, Red, Brown", "60%", "RGB LED", "None", "PBT", 145, 4.5, "https://i.ebayimg.com/images/g/G5oAAOSwq5tix49L/s-l500.jpg");
			
			kc.postKeyboard(k1);
			kc.postKeyboard(k2);
			kc.postKeyboard(k3);
	}

	@Test
	void testGetKeyboard() {
		List<keyboard> testKc = kc.getKeyboard();
	}

	@Test
	void testPostKeyboard() {
		kc.postKeyboard(k1);
		List<keyboard> testKc = kc.getKeyboard();
	}

	@Test
	void testGetByName() {
		keyboard testKc = kc.getByName("Wooting Two HE");
	}

}
