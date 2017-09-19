package src.main.java.AccessModifiers;

public class PrivateClass {

	private static int I = 100;
	public static int J = 110;
	public int k = 90;

	public static void main(String[] args) {
		inStaticPrivateClass();
	}

	public static void inStaticPrivateClass() {
		System.out.println("public J value is : " + J);
		System.out.println("Private I value is : " + I);
	}
	
	public void inPrivateClass() {
		System.out.println("public J value is : " + J);
		System.out.println("Private I value is : " + I);
		System.out.println("public k value is : " + k);
	}

}
