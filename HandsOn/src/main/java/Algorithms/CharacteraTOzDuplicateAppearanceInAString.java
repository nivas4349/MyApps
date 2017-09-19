package src.main.java.Algorithms;

//O(N) - because this one depends on size of string

public class CharacteraTOzDuplicateAppearanceInAString {

	public static void main(String[] args) {
		String str = "sivasr";
		String str1 = "sivaredy";
		System.out.println(isUniqueChars(str1));
		System.out.println(isUniqueChars(str));
		str = "chit";
		str1 = "lakshmi";
		System.out.println(isUniqueChars(str1));
		System.out.println(isUniqueChars(str));
	}

	static boolean isUniqueChars(String str) {
		if (str.length() > 26)
			return false;

		int checker = 0;
		for (int i = 0; i < str.length(); i++) {
			int asciiDiff = (int) (str.charAt(i) - 'a');
			System.out.println(asciiDiff);
			System.out.println(Integer.toBinaryString(1 << asciiDiff));
			System.out.println(checker);
			System.out.println(Integer.toBinaryString(checker));
			System.out.println(checker & (1 << asciiDiff));
			System.out.println((checker & (1 << asciiDiff)) > 0);
			if ((checker & (1 << asciiDiff)) > 0)
				return false;

			checker |= 1 << asciiDiff;
		}
		return true;
	}

}
