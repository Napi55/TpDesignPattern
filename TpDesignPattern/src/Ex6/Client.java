package Ex6;

public class Client {

	public Client() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalFactory factory =  new AnimalFactory();
		factory.create("chien");
		factory.create("canard");
		factory.create("canard");

	}

}
