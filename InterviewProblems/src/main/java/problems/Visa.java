package main.java.problems;

public class Visa {

	public static void main(String[] args) {
		System.out.println(alphaNumericProcessor("printer"));
		System.out.println(alphaNumericProcessor("visa"));
		System.out.println(alphaNumericProcessor("function"));
	}

	static String alphaNumericProcessor(String input) {

		return input.charAt(0) + String.valueOf(input.length() - 2) + 
				input.charAt(input.length() - 1);
	}

}
