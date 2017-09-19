package src.main.java.AccessModifiers;

public class ChildClass extends PrivateClass {

	public static void main(String[] args) {
		PrivateClass pvt = new PrivateClass();
		PrivateClass pvt1 = new PrivateClass();
		PrivateClass pvt2 = new PrivateClass();
		pvt.inPrivateClass();
		pvt.k = 10;
		System.out.println(pvt.k);
		pvt.J=15;
		System.out.println(PrivateClass.J);
		System.out.println(pvt1.J);
		System.out.println(pvt2.J);
		System.out.println(pvt.J);
		PrivateClass.J=20;
		System.out.println(PrivateClass.J);
	}

}
