package main.java.problems;

/**
 * @author: Siva Srinivasa Pasam
 *
 */
public class AddWithoutUsingPlusSign {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(addNumber(123456789));
	}

	public static int addNumber(int i) {
		int result = 0;
		while (i > 0) {
			result = Math.addExact(i % 10, result);
			i = i / 10;
		}
		return result;
	}

}
