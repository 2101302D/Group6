package com.dvops.maven.eclipse;

import java.util.*;

public class mouseCollection {

    private ArrayList<Mouse> mouses = new ArrayList<>();

    public mouseCollection() {
    }

    public List<Mouse> getMouses() {
        return mouses;
    }
    
    public void postMouses(Mouse mouseData) {
    	mouses.add(mouseData);
    }
    
    public Mouse getByName(String name){
    	for (Mouse m : mouses) { 		      
            if(m.getName().equals(name)) return m;
       }
    	return null;
    }
}