package Ex6;

public class Chien implements Animal{

	public Chien() {
		Description();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getAnimal() {
		// TODO Auto-generated method stub
		return "Chien";
	}

	@Override
	public String Makesound() {
		// TODO Auto-generated method stub
		return "How How";
	}
	@Override
	public void Description() {
		// TODO Auto-generated method stub
		System.out.println("Create new Animal <<type: "+this.getAnimal()+" Make Soud"+this.Makesound()+">>");
		
	}


}
