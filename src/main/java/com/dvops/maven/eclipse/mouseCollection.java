package com.dvops.maven.eclipse;

import java.util.*;

public class mouseCollection {

    private ArrayList<mouseServlet> mouses = new ArrayList<>();
    private int capacity;

    public mouseCollection() {
    	/*songs.add(new Song("0001","good 4 u","Olivia Rodrigo",3.59));
    	songs.add(new Song("0002","Peaches","Justin Bieber",3.18));
    	songs.add(new Song("0003","MONTERO","Lil Nas X",2.3));
    	songs.add(new Song("0004","bad guy","Billie Eilish",3.14));*/
    }

    public List<mouseServlet> getMouses() {
        return mouses;
    }
}