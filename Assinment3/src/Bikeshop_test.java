
public class Bikeshop_test {
	public static void main(String[] args) {

/**bikeshop*/
		BikeStore JansCykler = new BikeStore();
		
/**bikes*/
		JansCykler.addBike("rainbow", 11, 10000);
		JansCykler.addBike("green", 10, 4000);
		JansCykler.addBike("yellow", 12, 2000);
		JansCykler.addBike("black", 18, 8888);
		JansCykler.addBike("pink", 15, 9999);
	
/** write to console fingers crossed*/
			System.out.println(JansCykler.getAllBikes());
		
}
}