package Ex1;

import java.util.ArrayList;
import java.util.List;



public class DptPilotage extends Departement {
	private List<Departement> departements;
	public DptPilotage(String name) {
	   	 this.name=name;
	   	 this.type="Pilotage";
	   	 this.departements =  new ArrayList<Departement>();
	    }
	
	@Override
	public  void add(Departement departement) {
		departements.add(departement);
		
	}
	@Override
	public  void remove(Departement departement) {
		departements.remove(departement);
	}
	@Override
	public Departement getChild(int k) {
		return departements.get(k);
	}
	@Override
	public void description() {
		System.out.println("type: "+this.type+"name: "+this.name);
		 System.out.print("Les depatements  : ");
		 
		 for(Departement d : departements) {
			 
			 d.description();
			 
		 }
		
		
	}

}
