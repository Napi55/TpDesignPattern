package Ex1;

public class Test {

	public static void main(String[] args) {
		Departement DptPilotage = new DptPilotage("Departement de Pilotage");
		Departement DptComptabilité = new DptComptabilité("Departement de Comptabilité");
		Departement DptGestion = new DptGestion("Departement de Gestion");
		Departement DptFinance = new DptFinance("Departement de Finance");
		
		DptPilotage.add(DptFinance);
		DptPilotage.add(DptComptabilité);
		DptPilotage.add(DptGestion);
		
		DptPilotage.description();
		

	}

}
