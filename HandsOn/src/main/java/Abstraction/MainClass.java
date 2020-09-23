package abstraction;

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

			@Override
			public void abstractMethod() {
				// TODO Auto-generated method stub
				
			}

			@Override
			protected char[] anotherMethod() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		System.out.println(ab.anotherMethod());
	}

}
