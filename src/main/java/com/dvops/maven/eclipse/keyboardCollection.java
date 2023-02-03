package com.dvops.maven.eclipse;

import java.util.*;

public class keyboardCollection {

    private ArrayList<keyboard> keyboards = new ArrayList<>();

    public keyboardCollection() {
    }

    public List<keyboard> getKeyboard() {
        return keyboards;
    }
    
    public void postKeyboard(keyboard keyboardData) {
    	keyboards.add(keyboardData);
    }
    
    public keyboard getByName(String name){
    	for (keyboard k : keyboards) { 		      
            if(k.getName().equals(name)) return k;
       }
    	return null;
    }
}