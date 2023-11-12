package Ex5;

public class implAdaptee {

	public implAdaptee() {
		// TODO Auto-generated constructor stub
	}
	public int multiplyByAdd(int a, int b) {
		int result = 0;
		for(int i=0;i<b;i++) {
			result+=a;
		}
		return result;
		
	}

}
