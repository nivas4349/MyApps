package main.java.problems;

// Implement the following function. The goal of this function is to return true if the first string is a subsequence of the second.

public class Amazon {

	public static void main(String[] args) {
		// Examples:
		System.out.println(isSubsequence("aba", "baaaxxxxxba"));// -> true
		System.out.println(isSubsequence("aba", "baaaxxxxxb"));// -> false

	}

	static boolean isSubsequence(String first, String second) {
		int asciiChar;
		int secondIndex = -1;
		int counter = 0;
		for (int i = 0; i < first.length(); i++) {
			asciiChar = (int) first.charAt(i);
			for (int j = secondIndex + 1; j < second.length(); j++) {
				if (asciiChar == (int) second.charAt(j)) {
					secondIndex = j;
					counter++;
					break;
				}
			}
		}
		if (first.length() == counter) {
			return true;
		} else
			return false;
	}

}
