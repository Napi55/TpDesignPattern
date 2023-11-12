package Ex3;

public class ProxyPatternTest {



	public static void main(String[] args) {
		Image img = new ProxyImage("Zoro.png");
		img.display();
		img.display();

	}

}
