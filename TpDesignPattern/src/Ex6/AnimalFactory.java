package Ex6;

public class AnimalFactory implements AbstractFactory {

	public AnimalFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Animal create(String type) {
		if(type=="chien") {
		return new Chien();
			
		}else if(type=="canard") {
			return new Canard();
			
		}
		return null;
		
	}
	

}
