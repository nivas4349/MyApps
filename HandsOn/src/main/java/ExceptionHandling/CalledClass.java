package src.main.java.ExceptionHandling;

public class CalledClass {

	public static void main(String[] args) {

	}

	public void throwMethod() {
		try {
			int i = 100 / 0;
		} catch (Exception e) {
			e.printStackTrace();
//			throw e;
		}
	}
}
