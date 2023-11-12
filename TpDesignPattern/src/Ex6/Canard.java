package Ex6;

public class Canard implements Animal  {

	public Canard() {
		Description();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getAnimal() {
		// TODO Auto-generated method stub
		return "Canard";
	}

	@Override
	public String Makesound() {
		// TODO Auto-generated method stub
		return "BatBat";
	}

	@Override
	public void Description() {
		// TODO Auto-generated method stub
		System.out.println("Create new Animal <<type: "+this.getAnimal()+" Make Soud"+this.Makesound()+">>");
		
	}

}
