package LeetCode;

/**
 * @author: Siva Srinivasa Pasam
 *
 */
public class AddBinaryString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(addBinaryStrings("0000", "0000000"));
	}

	private static String addBinaryStrings(String a, String b) {
		//Incomplete
		String s = "";
		boolean carryOver = false;
		int i = a.length() - 1, j = b.length() - 1;
		for (; i >= 0 || j >= 0; i--, j--) {
			if (a.charAt(i) == '1' && b.charAt(j) == '1') {
				carryOver = true;
				s = "0" + s;
			}
		}
		return s;
	}

}
