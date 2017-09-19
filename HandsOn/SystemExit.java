
public class SystemExit {

	public static void main(String[] args) {
		try {
			int i = 100 / 0;
		} catch (Exception e) {
			System.out.println("in catch block");
			System.exit(0); // exit 0 means everything went fine
		} finally {
			/*
			 * times finally won't be called are: if you call System.exit() or
			 * if the JVM crashes first, if there is an infinite loop in the try
			 * block, if the power turns off
			 */
			System.out.println("In final block");
		}
	}

}
