package Ex4;

public class Client {

	public Client() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	 DataWather dataWather = new DataWather();
	 displayData displayData = new displayData();
	 dataWather.addObserver(displayData);
	 dataWather.setMeasurements(100, 25);
	 dataWather.setMeasurements(75, 13);
	 

	}

}
