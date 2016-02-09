public class House{
	int minSize = 10;
	int maxSize = 1000;
	int minYear = 1800;
	int maxYear = 2015;
	private int yearBuilt;
 private int size;

 
 public House(int yearBuilt,int size){
	 if (size >= minSize && size <= maxSize){
			this.size = size;
		} else {
			this.size = 0;
		}

		if (yearBuilt >= minYear && yearBuilt <= maxYear){
			this.yearBuilt = yearBuilt;
		} else {
			this.yearBuilt = 0;
		}
		}
 
 public int getYearBuilt(){
              return this.yearBuilt;
 }
 public int getSize(){
               return this.size;
 }
}