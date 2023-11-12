package Ex4;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class displayData implements Observer {
	private float temperature;
    private float humidity;
    DataWather wather;

	public displayData() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof DataWather) {
			 wather =(DataWather) o;
			this.temperature=wather.getTempurature();
			this.humidity=wather.getHumidity();
			display();
		}
		
	}
	 public void display() {
	        System.out.println("Current Display: Temperature = " + temperature + "°C, Humidity = " + humidity + "%");
	    }

}
