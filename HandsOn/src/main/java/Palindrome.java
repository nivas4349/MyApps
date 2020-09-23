public class Palindrome {

	public static void main(String[] args) {
		String str = "Madam";
		String str1 = "madam";
		String str2 = "siv";
		String sentence = "madam is im adam";
		String sentence1 = "madam is im ad am ";
		String sentence2 = "jumbare is a jumbare";

		// passing string with spaces i.e full sentences
		Palindrome p = new Palindrome();
		p.isPalindromeRemovingSpaces(sentence);
		p.isPalindromeRemovingSpaces(sentence1);
		p.isPalindromeRemovingSpaces(sentence2);
		p.isPalindromeRemovingSpaces(str);
		p.isPalindromeRemovingSpaces(str1);
		p.isPalindromeRemovingSpaces(str2);

		// passing char array
		System.out.println(isPalindromeCharArray(str.toCharArray()));
		System.out.println(isPalindromeCharArray(str1.toCharArray()));
		char[] charArr = { 's', 'i', 'v' };
		System.out.println(isPalindromeCharArray(charArr));

		// passing string
		System.out.println(isPalindromeString(str));
		System.out.println(isPalindromeString(str1));
		System.out.println(isPalindromeString(str2));

		// passing string to evaluate half with the other half
		System.out.println(isPalindromeStringHalf(str));
		System.out.println(isPalindromeStringHalf(str1));
		System.out.println(isPalindromeStringHalf(str2));

		System.out.println(isPalindromeCharArrayHalf(str.toCharArray()));
		System.out.println(isPalindromeCharArrayHalf(str1.toCharArray()));
		char[] charArray = { 's', 'i', 'v' };
		System.out.println(isPalindromeCharArrayHalf(charArray));
	}

	protected boolean isPalindromeRemovingSpaces(String str) {
		int forwardCount = 0, backwardCount = 0;
		for (int i = 0; i < (str.length() - forwardCount - backwardCount) / 2; i++) {
			if (str.charAt(i + forwardCount) == ' ')
				forwardCount++;
			if (str.charAt(str.length() - i - 1 - backwardCount) == ' ')
				backwardCount++;
			// System.out.println(str.charAt(i + forwardCount));
			// System.out.println(str.charAt(str.length() - i - 1 -
			// backwardCount));
			if (str.charAt(i + forwardCount) != str.charAt(str.length() - i - 1 - backwardCount)) {
				System.out.println(false);
				return false;
			}
		}
		System.out.println(true);
		return true;
	}

	static boolean isPalindromeStringHalf(String str) {
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				System.out.println("str.charAt(i) : " + str.charAt(i));
				System.out.println("str.charAt(str.length() - i - 1) : " + str.charAt(str.length() - i - 1));
				return false;
			}
		}
		System.out.println(str);
		return true;
	}

	static boolean isPalindromeCharArrayHalf(char[] charArray) {
		for (int i = 0; i < charArray.length / 2; i++) {
			if (charArray[i] != charArray[charArray.length - i - 1]) {
				System.out.println("charArray[i] : " + charArray[i]);
				System.out.println("charArray[charArray.length - i - 1] : " + charArray[charArray.length - i - 1]);
				return false;
			}
		}
		System.out.println(new String(charArray));
		System.out.println(String.valueOf(charArray));
		System.out.println(String.copyValueOf(charArray));
		return true;
	}

	static boolean isPalindromeString(String str) {
		String temp = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			temp += str.charAt(i);
		}
		if (str.equals(temp))
			return true;
		return false;
	}

	static boolean isPalindromeCharArray(char[] input) {
		char[] temp = new char[input.length];
		for (int i = 0; i < input.length; i++) {
			temp[input.length - i - 1] = input[i];
		}
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			if (temp[i] == input[i])
				count++;
		}
		if (count == input.length)
			return true;
		return false;
	}

	// for, class named MainClass
	static void printSomething() {
		System.out.println("Printing something in Palindrome Class");
	}

}
