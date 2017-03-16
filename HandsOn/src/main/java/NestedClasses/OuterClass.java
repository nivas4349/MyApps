package src.main.java.NestedClasses;

public class OuterClass {
	private static String msg = "HelloWorld";

	private static class StaticTextPrinter {
		public void printText() {
			System.out.println("Msg from nested static class : " + msg);
		}
	}

	private class NonStaticTextPrinter {
		public void printNonStatic() {
			System.out.println(" Msg from non static nested class : " + msg);
		}
	}

	public static void main(String[] args) {
		OuterClass.StaticTextPrinter staticPrinter = new OuterClass.StaticTextPrinter();
		staticPrinter.printText();
		OuterClass outerClass = new OuterClass();

		OuterClass.NonStaticTextPrinter nonStaticTextPrinter = outerClass.new NonStaticTextPrinter();
		nonStaticTextPrinter.printNonStatic();
	}

}