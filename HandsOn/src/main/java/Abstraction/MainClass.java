package src.main.java.Abstraction;

public class MainClass {

	public static void main(String[] args) {
		AbstractClass ab = new AbstractClass() {

			@Override
			int someOtherMethod() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			int someMethod() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		System.out.println(ab.anotherMethod());
	}

}
