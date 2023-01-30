package com.dvops.maven.eclipse;

import java.util.Comparator;
import java.util.Objects;

public class keyboard {
	private String id;
	private String name;
	private String switches;
	private String size;
	private String backlight;
	private String passthrough;
	private String keycaps;
	private Double price;
	private Number rating;
	private String image;

	

	

	public keyboard(String id,String name, String switches, String size, String backlight, String passthrough, String keycaps, Double price, Number rating, String image) 
	{	
		this.id = id;
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
	
	public String getId() {
		return id;
	}
	public String getBacklight() {return backlight;}
	
	public String getPassthrough() {return passthrough;}
	
	public String getKeycaps() {return keycaps;}
	
	public Double getPrice() {return price;}
	
	public Number getRating() {return rating;}
	
	public String getImage() {return image;}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSwitches(String switches) {
		this.switches = switches;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setBacklight(String backlight) {
		this.backlight = backlight;
	}
	
	public void setPassthrough(String passThrough) {
		this.passthrough = passThrough;
	}
	
	public void setKeycaps(String keycaps) {
		this.keycaps = keycaps;
	}
	
	public void setPrice(double price) { this.price = price; }
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public void setImage(String image) {
		this.image = image;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, id, backlight, passthrough, keycaps, price, rating, image);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof keyboard))
			return false;
		keyboard other = (keyboard) obj;
		return Objects.equals(name, other.name) && Objects.equals(id, other.id)
				&& Objects.equals(backlight, other.backlight) && Objects.equals(passthrough, other.passthrough) 
				&& Objects.equals(keycaps, other.keycaps) && Double.doubleToLongBits(price) == Double.doubleToLongBits(price)
				&& Objects.equals(rating, other.rating) && Objects.equals(image, other.image);
 	}
	
	public static Comparator<keyboard> nameComparator = new Comparator<keyboard>() {
		@Override
		public int compare(keyboard k1, keyboard k2) {
			return (int) (k1.getName().compareTo(k2.getName()));
		}
	};
	
	public static Comparator<keyboard> priceComparator = new Comparator<keyboard>() {
		@Override         
	    public int compare(keyboard k1, keyboard k2) {             
	      return (k2.getPrice() < k1.getPrice() ? -1 :                     
	              (k2.getPrice() == k1.getPrice() ? 0 : 1));           
	    }     
	};
}
