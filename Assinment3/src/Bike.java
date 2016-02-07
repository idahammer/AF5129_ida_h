public class Bike {

	/** instance variables*/
	private String color;
	private int price;
	private int size;	
	

	/** new bike with Color and Size*/
public Bike (String color, int size){
this.color = color;
this.size = size;
}
/** constructer */
public Bike (String color, int size, int price){
this.color= color;
this.size = size;
this.price = price;


/** 
 *1. Boolean testing whether the color is one of my chosen ones in my MY_COLORS constants.
 *If it's not, set it to the value "Default pink".
 *2. If-statement, testing whether the size and price is within the set values MIN and MAX, if not
 * set the value to 2.
 */
boolean acceptedColor = false;
for (int i = 0; i < Constans.MY_COLORS.length; i++) {
	if (Constans.MY_COLORS[i].equals(color)) {
		acceptedColor = true;
	}
}

if (acceptedColor == true) {
	this.color = color;
} else {
	this.color = "Default Pink";
}

if (size >= Constans.MIN_SIZE && size <= Constans.MAX_SIZE){
	this.size = size;
} else {
	this.size = 0;
}

if (price >= Constans.MIN_PRICE && price <= Constans.MAX_PRICE){
	this.price = price;
} else {
	this.price = 0;
}
}

/** returns the color*/
public String getColor(){
	return this.color;
}

/**returns the size */
public int getSize() {
	return this.size;
}

/**returns the price */
public int getPrice() {
	return this.price;
}

}