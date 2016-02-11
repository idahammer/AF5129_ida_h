
public class Cat extends Mammal{
private int numberOfLifes;	


public Cat(String friendlyName, String latinName, int gestationTime,int numberOfLifes){
	super(latinName, gestationTime);
	this.numberOfLifes = numberOfLifes;
	this.setFriendlyName(friendlyName);
	}
public int getNumberOfLifes(){
	return numberOfLifes;
}

@Override
public String getInfo() {
	return "Katten " + getFriendlyName() + " på latin: " + getLatinName() + " plejer sine unger i " + getGestationtime() + " måneder og har " + numberOfLifes + " liv"; 

}


}