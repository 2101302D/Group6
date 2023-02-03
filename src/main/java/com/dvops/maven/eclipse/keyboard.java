package com.dvops.maven.eclipse;

public class keyboard {
	private String name;
	private String switches;
	private String size;
	private String backlight;
	private String passthrough;
	private String keycaps;
	private Number price;
	private Number rating;
	private String image;
	

	

	public keyboard(String name, String switches, String size, String backlight, String passthrough, String keycaps, Number price, Number rating, String image) 
	{	
		this.name = name;
		this.switches = switches;
		this.size = size;
		this.backlight = backlight;
		this.passthrough = passthrough;
		this.keycaps = keycaps;
		this.price = price;
		this.rating = rating;
		this.image = image;
		
	}
	
	public String getName() {return name;}
	
	public String getSwitches() {return switches;}
	
	public String getSize() {return size;}
	
	public String getBacklight() {return backlight;}
	
	public String getPassthrough() {return passthrough;}
	
	public String getKeycaps() {return keycaps;}
	
	public Number getPrice() {return price;}
	
	public Number getRating() {return rating;}
	
	public String getImage() {return image;}
	
	
	
}
