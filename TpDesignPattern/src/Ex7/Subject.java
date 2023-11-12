package Ex7;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class Subject extends Observable {
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		setChanged();
		notifyObservers();
	}

	public Subject() {
		// TODO Auto-generated constructor stub
	}

}
