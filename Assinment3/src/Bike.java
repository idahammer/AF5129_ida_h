


public class Bike {

	private String color= "none";
	private int price = 0;
	private int size = 0;


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

public void setPrice(int price){;
this.price = price;
}
}