package Ex1;

public class DptFinance extends Departement{
	
	
    public DptFinance(String name) {
   	 this.name=name;
   	 this.type="Finance";
    }
	@Override
	public void description() {
		System.out.println("type: "+this.type+"name: "+this.name);
		
	}

}
