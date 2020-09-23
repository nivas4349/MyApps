package abstraction;

public class AnotherMainClass extends AbstractClass {

	public static void main(String[] args) {
		AnotherMainClass an = new AnotherMainClass();
		System.out.println(an.someMethod());
		System.out.println(an.someOtherMethod());
		System.out.println(an.anotherMethod());
	}

	protected char[] anotherMethod() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	int someMethod() {
		return 2;
	}

	@Override
	int someOtherMethod() {
		return 3;
	}

	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		
	}

}
