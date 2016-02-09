import java.util.ArrayList;

public class Dogsandhumans {
	public static void main(String[] args) {
	    String name = "jeg er ikke så glad";
	    name = name.replaceAll("\\b[\\w']{1,2}\\b", "");
	    

	    System.out.println(name);
	}


}
