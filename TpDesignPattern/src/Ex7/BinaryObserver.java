package Ex7;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class BinaryObserver implements Observer{
	Subject subject;

	public BinaryObserver() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof Subject) {
			subject = (Subject)o;
			System.out.println("BinaryObserver,new state is :"+subject.getState());
			
		}
		
		
	}

}