package tekSystems;

public class IKMTest {

	public static void main(String[] args) {
		int x = 0;
		if (x > 0) {
			System.out.println("12");
			System.out.println("32");
		}
		
		System.out.println("Current : " + Runtime.getRuntime().totalMemory());
		System.out.println("Max : " + Runtime.getRuntime().maxMemory());
		System.out.println("Free : " + Runtime.getRuntime().freeMemory());
		
	}
	
	protected int getL() {
		return 1;
	}

}
