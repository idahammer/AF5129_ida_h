
	public class Snake extends Animal {
		private boolean poisonus;

		public Snake(String friendlyName, String latinName, boolean poisonus){
			super(latinName);
		this.setFriendlyName(friendlyName);
		this.poisonus = poisonus;
		}

		public boolean isPoisonus(){
			return poisonus;
			
		}		
		@Override
		public String getInfo() {
			return "Slangen som hedder " + getFriendlyName() + " på latin: " + getLatinName()  + (poisonus ? " er " : " er ikke ") + "giftig"; 

		}
		}
