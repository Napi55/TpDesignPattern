package Ex5;

public class Client {

	public Client() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    implAdaptee implAdaptee = new implAdaptee();
		Standard adapter = new Adapter(implAdaptee);
		ImplStandard standard = new ImplStandard();
		
		System.out.println("Adaptée, Résultat="+adapter.multiplication(5, 7));
		System.out.println("implStandard \"By Multip\", Résultat="+standard.multiplication(5, 7));
		System.out.println("implAdaptee \"By Add\", Résultat="+implAdaptee.multiplyByAdd(5, 7));


	}

}
