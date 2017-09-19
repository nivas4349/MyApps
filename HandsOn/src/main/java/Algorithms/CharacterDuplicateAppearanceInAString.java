package src.main.java.Algorithms;

//O(N) - because this one depends on size of string

public class CharacterDuplicateAppearanceInAString {

	public static void main(String[] args) {

		String str = "Siva srINPA";
		String str1 = "Jingle BEL";
		System.out.println(iSUniqueCharacters(str));
		System.out.println(iSUniqueCharacters(str1));
	}

	static boolean iSUniqueCharacters(String str) {
		if (str.length() > 128)
			return false;

		boolean[] charSet = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int ascii = (int) str.charAt(i);
			if (charSet[ascii])
				return false;
			charSet[ascii] = true;
		}
		return true;
	}
}
