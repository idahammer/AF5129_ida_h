
public class Dog extends Mammal{
	private boolean stupid;
	
	public Dog(String latinName, int gestationTime,boolean stupid){
		super(latinName, gestationTime);
		this.stupid = stupid;
		}

	
	
	public Dog(String friendlyName, String latinName, int gestationTime,boolean stupid){
		super(latinName, gestationTime);
		this.stupid = stupid;
		this.setFriendlyName(friendlyName);

		}

	public boolean isStupid(){
		return stupid;
		
	}

	@Override
	public String getInfo() {
		return "Hunden " + getFriendlyName() + " på latin: " + getLatinName() + " plejer sine unger i " + getGestationtime() + " og " + (stupid ? " er " : " er ikke ") + "dum"; 

	}
	}


