package src.main.java.Abstraction;

public class AnotherMainClass extends AbstractClass {

	public static void main(String[] args) {
		AnotherMainClass an = new AnotherMainClass();
		System.out.println(an.someMethod());
		System.out.println(an.someOtherMethod());
		System.out.println(an.anotherMethod());
	}

	@Override
	int someMethod() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	int someOtherMethod() {
		// TODO Auto-generated method stub
		return 3;
	}

}
