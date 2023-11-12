package Ex1;

public abstract class Departement {
	String name;
	String type;
	public abstract void description();
	public  void add(Departement departement) {}
	public  void remove(Departement departement) {}
	public Departement getChild(int k) {
		return null;
	}
	

}
