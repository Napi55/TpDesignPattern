package Ex7;

public class ObserverPatternDemo {



	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject sub = new Subject();
		BinaryObserver binary = new BinaryObserver();
		sub.addObserver(binary);
		HexaObserver hexa = new HexaObserver();
		sub.addObserver(hexa);
		OctalObserver octal=new OctalObserver() ;
		sub.addObserver(octal);
		sub.setState(122);
		sub.setState(5);

	}

}
