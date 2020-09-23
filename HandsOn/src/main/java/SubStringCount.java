

/**
 * @author: Siva Srinivasa Pasam Jun 9, 2020
 *
 */
public class SubStringCount {

	public static void main(String[] args) {
		System.out.println(isDivisible("abcabc", "abc"));
	}

	public static boolean isDivisible(String first, String second) {
		if (first.length() % second.length() != 0)
			return false;
		if (first.equals(second))
			return true;
		if (first.substring(0, second.length()).equals(second)) {
			if (isDivisible(first.substring(second.length(), 2 * second.length()), second)) {
				return true;
			}
		} else
			return false;
		return false;
	}
}
