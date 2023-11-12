package Ex3;

public class RealImage implements Image {
	private String fileName;
	

	public RealImage(String fileName) {
		this.fileName =fileName;
		LoadFromDisk();
	}
     public void  LoadFromDisk() {
    	 System.out.println("Chargement de l'image : " + fileName);
     }
	@Override
	public void display() {
		System.out.println("Affichage de l'image : " + fileName);
		
	}
	


	

}
