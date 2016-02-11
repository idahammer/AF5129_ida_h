
public abstract class Animal {
private String latinName;
private String friendlyName;


public Animal (String latinName){
	this.latinName = latinName;
}

public abstract String getInfo();


public void setFriendlyName(String name){
friendlyName = name;
}

public String getFriendlyName(){
return friendlyName;
}

public void setLatinName(String name1){
	latinName = name1;
}
public String getLatinName(){
	return latinName;
}

}



