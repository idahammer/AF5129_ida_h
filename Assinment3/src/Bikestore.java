import java.util.ArrayList;

public class Bikestore {
	private ArrayList<Bike> bikes= new ArrayList<Bike>();
	
		
	
	public String getAllBikes(){
		String s = "";
		for (Bike bike : bikes) {
			s = s + "color: "+ bike.getColor()+" size: "+ bike.getSize()+ "price:" + bike.getPrice() + "\n";
		}
		return s;
	}
	
	public void addBike(Bike s){
	this.bikes.add(s);
	}
}
