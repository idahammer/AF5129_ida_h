import java.util.ArrayList;

public class BikeStore {
			public BikeStore(){
		}

		private ArrayList<Bike> allBikes = new ArrayList<Bike>();{	
		}
		
		
		/** All the bikes added in "addBike" */
	    public String getAllBikes() {
	        String returnString = "";
	        int counter = 1;
	            for (Bike s : allBikes) {
	                returnString = returnString + "Cykel nr:" + counter + " har farven: " + s.getColor() + ". Og størrelsen: " + s.getSize() + " Tommer. Prisen er: " + s.getPrice() + " KR.\n";
	                counter++; 
	           }
	            return returnString;
	    }

	    /** add bike to ArrayList*/
	    public void addBike(String color, int size, int price){
		Bike b = new Bike(color, size, price);
		this.allBikes.add(b);
	}
	}

