package Ex2;

public class Test {

	

	public static void main(String[] args) {
		UsaSystem UsaSystem = new UsaSystem(100);
		FrSystem FrSystem = new FrSystem(UsaSystem);
		 System.out.println("Vitesse en kilomètres par heure : " + FrSystem.convertir());
	}

}
