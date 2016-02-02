import java.util.ArrayList;

public class Main {
public static void main(String [] args) {
	
	ArrayList<Bike> myBikes;
	myBikes = new ArrayList <Bike> ();
	
	Bike a = new Bike("red",10, 1000);
	myBikes.add (a);
	Bike b = new Bike ("yellow", 12 , 10);
	myBikes.add (b);
	Bike c = new Bike ("pink", 12 , 10);
	myBikes.add (c);
	Bike d = new Bike ("re", 12 , 10);
	myBikes.add (d);
	Bike e = new Bike ("re", 12 , 10);
	myBikes.add (e);
	Bike f = new Bike ("re", 12 , 10);
	myBikes.add (f);
	Bike g = new Bike ("re", 12 , 10);
	myBikes.add (g);
	Bike h = new Bike ("re", 12 , 10);
	myBikes.add (h);
	Bike i = new Bike ("re", 12 , 10);
	myBikes.add (i);
	Bike j = new Bike ("re", 12 , 10);
	myBikes.add (j);
	
	for (int k = 0; k < myBikes.size(); k++) {
		System.out.println(myBikes.get(k));
	
}
}
}	
	
	