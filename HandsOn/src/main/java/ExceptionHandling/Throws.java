package src.main.java.ExceptionHandling;

public class Throws {

	public static void main(String[] args) {
		Throws t = new Throws();
		t.throwsClass();
	}

	public void throwsClass() {
		try {
			int j = 0;
			if (j == 0)
				throw new ArithmeticException("Division by Zero");
			int i = 100 / j;
		} catch (Exception e) {
			int i = 100 / 0;
			e.printStackTrace();
		}
	}
}