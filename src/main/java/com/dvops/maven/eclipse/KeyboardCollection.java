package com.dvops.maven.eclipse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KeyboardCollection{
	 private ArrayList<keyboard> keyboards = new ArrayList<>();
	    private int capacity;

	    public KeyboardCollection() {
	        this.capacity = 20;
	    }

	    public KeyboardCollection(int capacity) {
	        this.capacity = capacity;
	    }

	    public List<keyboard> getKeyboard() {
	        return keyboards;
	    }

	    public void addKeyboard(keyboard keyboard) {
	    	if(keyboards.size() != capacity) {
	    		keyboards.add(keyboard);
	    	}
	    }
	    
	    public ArrayList<keyboard> sortKeyboardsByName() {         
	        Collections.sort(keyboards, keyboard.nameComparator);         
	        return keyboards;     
	    } 
	    
	    public ArrayList<keyboard> sortKeyboardsByPrice() {         
	        Collections.sort(keyboards, keyboard.priceComparator);         
	        return keyboards;       
	    } 
	    
	    public keyboard findKeyboardbyId(String id) {
	    	for (keyboard k : keyboards) { 		      
	            if(k.getId().equals(id)) return k;
	       }
	    	return null;
	    }

	    public keyboard findKeyboardbyName(String name) {
	    	for (keyboard k : keyboards) { 		      
	            if(k.getName().equals(name)) return k;
	       }
	    	return null;
	    }
	    
}