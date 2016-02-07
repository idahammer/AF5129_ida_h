import java.util.ArrayList;

public class Main {
	
/** ArrayList with Bikes */
	public static void main(String[] args) {
		ArrayList<Bike> myBikes = new ArrayList<Bike>();
	
			
			myBikes.add(new Bike("blue", 12, 5000));
			myBikes.add(new Bike("yellow", 13, 2800));
			myBikes.add(new Bike("rainbow", 14, 10000));
			myBikes.add(new Bike("grey", 15, 5433));
			myBikes.add(new Bike("black", 16, 12000));
			myBikes.add(new Bike("green", 17, 1100));
			myBikes.add(new Bike("pink", 18, 8890));
			myBikes.add(new Bike("yellow", 19, 3333));
			myBikes.add(new Bike("veryblack", 20, 7000));
			myBikes.add(new Bike("überblack", 11, 7355));
	    
			/** Write bikes to console*/
	int nummer = 1; 
		for(Bike b:myBikes){
			System.out.println("Cykel nr: " + nummer++ + " Farven er: " + b.getColor() + " Størrelsen er: " + b.getSize() + " Tommer stor. " + "Den koster: " + b.getPrice() + " KR ");
		}
	}

}