package src.main.java.ExceptionHandling;

public class CallingClass {

	public static void main(String[] args) {

		CalledClass c = new CalledClass();
		Throws t = new Throws();
		try {
//			c.throwMethod();
			t.throwsClass();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
