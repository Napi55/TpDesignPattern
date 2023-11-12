package Ex1;

public class DptGestion extends Departement{
	
	
    public DptGestion(String name) {
   	 this.name=name;
   	 this.type="Gestion";
    }
	@Override
	public void description() {
		System.out.println("type: "+this.type+"name: "+this.name);
		
	}

}
