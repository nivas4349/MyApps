package LeetCode;

public class LengthOfLastword {

	public static void main(String[] args) {
		LengthOfLastword llw = new LengthOfLastword();
		System.out.println(llw.lengthOfLastWord("Siva Srinivasa Pas  "));
		System.out.println(llw.lengthOfLastWord("Siva Srinivasa Pas"));
		System.out.println(llw.lengthOfLastWord("Siva Srinivasa  "));
		System.out.println(llw.lengthOfLastWord("Siva Srinivasa "));
		System.out.println(llw.lengthOfLastWord("  "));
		System.out.println(llw.lengthOfLastWord(""));
		System.out.println(llw.lengthOfLastWord("Srinivasa"));
	}

	private int lengthOfLastWord(String s) {
		if (s.length() == 0) {
			return 0;
		}
		boolean isAWord = false;
		int l = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (!isAWord && s.charAt(i) != ' ') {
				isAWord = true;
			}
			if (isAWord) {
				if (s.charAt(i) == ' ') {
					break;
				}
				l++;
			}
		}
		return l;
	}
}
