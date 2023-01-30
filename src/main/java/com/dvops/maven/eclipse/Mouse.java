package com.dvops.maven.eclipse;

public class Mouse {
	private String name;
	private String connection;
	private String buttons;
	private String DPI;
	private String weight;
	private String size;
	private String price;
	private String rating;
	private String image;
	private String description;
	

	

	public Mouse(String name, String connection, String buttons, String DPI, String weight, String size, String price, String rating, String image, String description) 
	{	
		this.name = name;
		this.connection = connection;
		this.buttons = buttons;
		this.DPI = DPI;
		this.weight = weight;
		this.size = size;
		this.price = price;
		this.rating = rating;
		this.image = image;
		this.description = description;
		
	}

	
	public String getName() {return name;}
	
	public String getConnection() {return connection;}
	
	public String getButtons() {return buttons;}
	
	public String getDPI() {return DPI;}
	
	public String getWeight() {return weight;}
	
	public String getSize () {return size;}
	
	public String getPrice() {return price;}
	
	public String getRating() {return rating;}
	
	public String getImage() {return image;}
	
	public String getDescription() {return description;}
	
	
	
}
