package Ex4;

import java.util.Observable;


@SuppressWarnings("deprecation")
public class DataWather extends Observable {
	private float tempurature;
	private float humidity;

	public DataWather() {
		// TODO Auto-generated constructor stub
	}
	public void setMeasurements(float humidity,float tempurature) {
		this.humidity = humidity;
		this.tempurature=tempurature;
		setChanged();
		notifyObservers();
	}
	public float getTempurature() {
		return tempurature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	
 
}
