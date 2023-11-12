package Ex2;

public class FrSystem  implements NewSystem{

	private UsaSystem UsaSystem;

	public FrSystem(UsaSystem UsaSystem) {
		this.UsaSystem = UsaSystem;
		
	}

	@Override
	public float convertir() {
		// TODO Auto-generated method stub
		return (float) (UsaSystem.getVitesse()*1.60934);
	}

}
