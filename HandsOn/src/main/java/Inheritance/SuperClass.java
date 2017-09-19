package src.main.java.Inheritance;

public class SuperClass {
	SuperClass() {
		System.out.println("In SuperClass Constructor");
	}

	private int num = 10;

	int number = 20;

	void someMethod() {
		System.out.println("In SuperClass's someMethod");
	}

	static void someOtherMethod() {
		System.out.println("In SuperClass's static someOtherMethod");
	}
}
