package src.main.java.Inheritance;

public class SubClass extends SuperClass {
	SubClass() {
		System.out.println("In SubClass Consstructor");
		System.out.println(super.number);
		System.out.println(++number);
	}

	static void someOtherMethod() {
		System.out.println("In SubClass's static someOtherMethod");
	}

	public static void main(String[] args) {
		SubClass sub = new SubClass();
		sub.someMethod();
		SubClass.someOtherMethod();
		SuperClass.someOtherMethod();
		// super.someOtherMethod();
	}
}
