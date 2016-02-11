import java.util.ArrayList;

public class Human {
private String name;
private Dog dog;

public Human(String name){
	this.name = name;
}
public String getName(){
return name;
}

public void buyDog(Dog dog){
	this.dog = dog;
}

/* Is there a dog, write human name + has a dog + dog name, else has no dog*/
public String getInfo() {
if(dog != null) {
return name + " har en hund som hedder " + dog.getDogName();
} else {
return name + " har ikke en hund";
}
}

}

