import java.util.ArrayList;

public class Human {
private String name;
Dog dog = new Dog(name);

public Human(String name){
	this.name = name;
}
public String getName(){
return this.name;
}

public String getInfo(){
	return this.name;
	
}
private ArrayList<Human> humanList = new ArrayList<Human>();{	
}


/** All the bikes added in "addBike" */
public String getAllBikes() {
    String returnString = "";
    int counter = 1;
        for (Human s : humanList) {
            returnString = returnString + "Cykel nr:" + counter + " har farven: " + s.getName() + ". Og størrelsen: " + s.dog() + " Tommer. Prisen er: " + s.getPrice() + " KR.\n";
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
