package com.dvops.maven.eclipse;

import java.util.*;

public class MouseCollection {

    private ArrayList<mouseServlet> mouses = new ArrayList<>();
    private int capacity;

    public MouseCollection() {
    	/*songs.add(new Song("0001","good 4 u","Olivia Rodrigo",3.59));
    	songs.add(new Song("0002","Peaches","Justin Bieber",3.18));
    	songs.add(new Song("0003","MONTERO","Lil Nas X",2.3));
    	songs.add(new Song("0004","bad guy","Billie Eilish",3.14));*/

        this.capacity = 20;
    }

    public MouseCollection(int capacity) {
        this.capacity = capacity;
    }

    public List<mouseServlet> getMouses() {
        return mouses;
    }

    public void addMouse(mouseServlet mouse) {
    	if(mouses.size() != capacity) {
    		mouses.add(mouse);
    	}
    }
    
    /*public mouseServlet findSongsById(String id) {
    	for (mouseServlet s : mouses) { 		      
            if(s.getId().equals(id)) return s;
       }
    	return null;
    }

    public mouseServlet findSongByTitle(String title) {
    	for (mouseServlet s : mouses) { 		      
            if(s.getTitle().equals(title)) return s;
       }
    	return null;
    }*/
}