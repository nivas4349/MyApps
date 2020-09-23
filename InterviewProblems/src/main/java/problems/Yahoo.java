package main.java.problems;

// Print reverse order of an int
// ex: 123 should be printed as 321, -123 should be printed as -321
public class Yahoo {

	public static void main(String[] args) {
		System.out.println(reverseInt(-1234560789));
	}

	static int reverseInt(int input) {
		int ans = 0;
		while (input != 0) {
			int unitDigit = input % 10;
			System.out.println(unitDigit);
			if (ans == -987065432)
				System.out.println(ans*10);
			ans = (ans * 10) + unitDigit;
			System.out.println(ans);
			input = input / 10;
			System.out.println(input);
		}
		return ans;
	}
}
