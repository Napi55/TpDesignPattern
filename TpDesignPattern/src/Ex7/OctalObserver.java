package Ex7;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class OctalObserver implements Observer{
	Subject subject;

	public OctalObserver() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof Subject) {
			subject = (Subject)o;
			System.out.println("OctalObserver,new state is :"+subject.getState());
			
		}
		
		
	}

}
