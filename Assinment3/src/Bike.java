public class Bike {

	private String color;
	private int price;
	private int size;
	
	

public Bike (String color, int size){
	this.color = color;
	this.size = size;
}
public Bike (String color, int size, int price){
this.color= color;
this.size = size;
this.price = price;

}
		


// metoder
public String getColor(){
	return this.color;
}

public int getSize() {
	return this.size;
}


public int getPrice() {
	return this.price;
}

public void setPrice(int price){
	if (price>Constans.MIN_PRICE && price <= Constans.MAX_PRICE){
		this.price = price;
	}
}

	
	
	
	public void setSize(int size){
		if (size>Constans.MIN_SIZE && size <= Constans.MAX_SIZE){
			this.size = size;
		}
}
}