package com.dvops.maven.eclipse;

import org.testng.annotations.AfterMethod;



import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

class KeyboardCollectionTest {
	
	private KeyboardCollection kc;
	private keyboard k1;
	private keyboard k2;
	private keyboard k3;
	private keyboard k4;
	private final int KEYBOARD_COLLECTION_SIZE = 4;
	private final int KEYBOARD_COLLECTION_CAPACITY = 20;

	@BeforeMethod
	@BeforeEach
	void setUp() throws Exception {
		kc = new KeyboardCollection();
		k1 = new keyboard("0", "giant keyboard", "red", "big", "bright", "major", "white", 130.00, 4, "https://store.storeimages.cdn-apple.com/8756/as-images.apple.com/is/MK2A3?wid=1200&hei=630&fmt=jpeg&qlt=95&.v=1628010471000");
		k2 = new keyboard("1", "Keychron Q1", "Box Whites", "tkl", "bright", "major", "white", 154.00, 3, "https://i.rtings.com/assets/products/jagfhnw9/keychron-q1/design-medium.jpg");
		k3 = new keyboard("2", "Signature K650", "Unknown", "Full", "None", "None", "white", 79.00, 3, "https://resource.logitech.com/w_692,c_limit,q_auto,f_auto,dpr_1.0/d_transparent.gif/content/dam/logitech/en/products/keyboards/k650-signature-wireless-keyboard/gallery/k650-top-off-white-us.png?v=1");
		k4 = new keyboard("3","Keychron K2 Wireless Mechanical Keyboard", "Gatreon G Pro Brown", "84 Keys", "White", "None", "Black Blue and Grey", 79.00, 4, "https://cdn.shopify.com/s/files/1/0059/0630/1017/products/Keychron-K2-wireless-mechanical-keyboard-for-Mac-Windows-iOS-Gateron-switch-brown-with-type-C-RGB-white-backlight-exclusive-color_540x.jpg?v=1650445595");
		kc.addKeyboard(k1);
		kc.addKeyboard(k2);
		kc.addKeyboard(k3);
		kc.addKeyboard(k4);
	}

	@AfterMethod
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetKeyboard() {
		int KEYBOARD_COLLECTION_SIZE_TEST = 4;
		AssertJUnit.assertEquals(kc.getKeyboard().size(), KEYBOARD_COLLECTION_SIZE_TEST);
	}

	@Test
	void testAddKeyboard() {
		List<keyboard> testKc = kc.getKeyboard();
		
		AssertJUnit.assertEquals(testKc.size(), KEYBOARD_COLLECTION_SIZE);
		
		kc.addKeyboard(k1);
		AssertJUnit.assertEquals(kc.getKeyboard().size(), KEYBOARD_COLLECTION_SIZE + 1);
	}
	

	@Test
	void testSortKeyboardsByName() {
		ArrayList<keyboard> kcTest = new ArrayList<>();
		kcTest.add(k1);
		kcTest.add(k2);
		
		ArrayList<keyboard> sortedKeyboards = kc.sortKeyboardsByName();
		
		AssertJUnit.assertEquals("giant keyboard", sortedKeyboards.get(3).getName());
		AssertJUnit.assertEquals("Keychron Q1", sortedKeyboards.get(1).getName());
		
	}

	@Test
	void testSortKeyboardsByPrice() {
		ArrayList<keyboard> kcTest = new ArrayList<>();
		kcTest.add(k1);
		kcTest.add(k2);
		
		ArrayList<keyboard> sortedKeyboards = kc.sortKeyboardsByPrice();
		
		AssertJUnit.assertEquals(130.00, sortedKeyboards.get(1).getPrice());
		AssertJUnit.assertEquals(154.00, sortedKeyboards.get(0).getPrice());
	}

	@Test
	void testFindKeyboardbyId() {
		 ArrayList<keyboard> keyboards = new ArrayList<>();
	        keyboards.add(k1);
	        keyboards.add(k2);

	        keyboard k = kc.findKeyboardbyId("0");

	        AssertJUnit.assertEquals("0", k.getId());
	}

	@Test
	void testFindKeyboardbyName() {
	    ArrayList<keyboard> keyboards = new ArrayList<>();
        keyboards.add(k1);
        keyboards.add(k2);

        keyboard k = kc.findKeyboardbyName("Keychron Q1");
        AssertJUnit.assertEquals("Keychron Q1", k.getName());
	}
	
	@Test
	void testFindKeyboardByName_Fail() {
		 ArrayList<keyboard> keyboards = new ArrayList<>();
	        keyboards.add(k1);
	        keyboards.add(k2);

	        keyboard k = kc.findKeyboardbyName("Keychron Q2");
	        AssertJUnit.assertNull(k);
	}
	
	@Test
	void testFindKeyboardbyId_Fail() {
		 ArrayList<keyboard> keyboards = new ArrayList<>();
	        keyboards.add(k1);
	        keyboards.add(k2);

	        keyboard k = kc.findKeyboardbyId("5");

	        AssertJUnit.assertNull(k);
	}
	
	@Test
	void keyboardAddEqualTest() {
		boolean IS_EQUAL = true;
		boolean k = kc.equals(kc);
		AssertJUnit.assertEquals(k, IS_EQUAL);
	}
	
	@Test
	void testEquals_True() {
		AssertJUnit.assertTrue(k1.equals(k1));
	}
	
	@Test
	void testEquals_False() {
		AssertJUnit.assertFalse(k1.equals(k2));
	}
	
	@Test
	void testEquals_NotKeyboard() {
		String k5 = "a";
		AssertJUnit.assertFalse(k1.equals(k5));
	}
	
	@Test
	void testHash_True() {
		AssertJUnit.assertEquals(k1.hashCode(), k1.hashCode());
	}
	
	@Test
	void testHash_False() {
		assertNotEquals(k1.hashCode(), k2.hashCode());
	}
	
	@Test
	void testSetName() {
		keyboard k = new keyboard(null, null, null, null, null, null, null, null, KEYBOARD_COLLECTION_CAPACITY, null);
		k.setName("Keychron Q2");
		AssertJUnit.assertEquals("Keychron Q2", k.getName());
	}
	
	@Test
	void testSetSwitch() {
		keyboard k = new keyboard(null, null, null, null, null, null, null, null, KEYBOARD_COLLECTION_CAPACITY, null);
		k.setSwitches("red");
		AssertJUnit.assertEquals("red", k.getSwitches());
	}
	
	@Test
	void testSetId() {
		keyboard k = new keyboard(null, null, null, null, null, null, null, null, KEYBOARD_COLLECTION_CAPACITY, null);
		k.setId("0");
		AssertJUnit.assertEquals("0",k.getId());
	}
	
	@Test
	void testSetBacklight() {
		keyboard k = new keyboard(null, null, null, null, null, null, null, null, KEYBOARD_COLLECTION_CAPACITY, null);
		k.setBacklight("Bright");
		AssertJUnit.assertEquals("Bright", k.getBacklight());
	}
	
	@Test
	void testSetPassthrough() {
		keyboard k = new keyboard(null, null, null, null, null, null, null, null, KEYBOARD_COLLECTION_CAPACITY, null);
		k.setPassthrough("Transparent");
		AssertJUnit.assertEquals("Transparent", k.getPassthrough());
	}
	
	@Test
	void testSetKeycaps() {
		keyboard k = new keyboard(null, null, null, null, null, null, null, null, KEYBOARD_COLLECTION_CAPACITY, null);
		k.setKeycaps("black");
		AssertJUnit.assertEquals("black", k.getKeycaps());
	}
	
	@Test
	void testSetPrice() {
		keyboard k = new keyboard(null, null, null, null, null, null, null, null, KEYBOARD_COLLECTION_CAPACITY, null);
		k.setPrice(120.00);
		AssertJUnit.assertEquals(120.00, k.getPrice());
	}
	
	@Test
	void testSetRating() {
		keyboard k = new keyboard(null, null, null, null, null, null, null, null, null, null);
		k.setRating(3);
		AssertJUnit.assertEquals(3, k.getRating());
	}
	
	@Test
	void testSetImage() {
		keyboard k = new keyboard(null, null, null, null, null, null, null, null, KEYBOARD_COLLECTION_CAPACITY, null);
		k.setImage("https://www.cnet.com/a/img/resize/19450244d75b42469f56dfbfdb0b7b39ddad50b6/hub/2021/08/20/453e37bf-61cb-4e16-ad90-fd822bdc390a/keychron-k3-mechanical-keyboard.jpg?auto=webp&fit=crop&height=1200&width=1200");
		AssertJUnit.assertEquals("https://www.cnet.com/a/img/resize/19450244d75b42469f56dfbfdb0b7b39ddad50b6/hub/2021/08/20/453e37bf-61cb-4e16-ad90-fd822bdc390a/keychron-k3-mechanical-keyboard.jpg?auto=webp&fit=crop&height=1200&width=1200", k.getImage());
	}
}
