package Ex1;

public class DptComptabilité extends Departement{
	
	
     public DptComptabilité(String name) {
    	 this.name=name;
    	 this.type="Comptabilité";
     }
	@Override
	public void description() {
		System.out.println("type: "+this.type+"name: "+this.name);
		
	}

}
