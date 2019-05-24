package src.main.java.Abstraction;

public class MainClass {

	public static void main(String[] args) {
		AbstractClass ab = new AbstractClass() {

			@Override
			int someOtherMethod() {
				return 0;
			}

			@Override
			int someMethod() {
				return 0;
			}
		};
		System.out.println(ab.anotherMethod());
	}

}
