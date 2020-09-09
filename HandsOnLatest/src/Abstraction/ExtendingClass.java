package Abstraction;

/**
 * @author: Siva Srinivasa Pasam
 *
 */
public class ExtendingClass{

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}
	public void doNothing() {
		AbstractClass abs = new AbstractClass() {
			@Override
			public void abstractMethod(){
				
			}
		};
	}

}
