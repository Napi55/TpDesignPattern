package Ex5;

public class Adapter implements Standard {
	private implAdaptee adaptee;

	public Adapter(implAdaptee adaptee) {
		// TODO Auto-generated constructor stub
		this.adaptee =adaptee;
	}

	@Override
	public int multiplication(int a, int b) {
		// TODO Auto-generated method stub
		return adaptee.multiplyByAdd(a, b);
	}

}
