package src.main.java.Problems;

import java.util.ArrayList;

/*
 Given number n. Print number from 1 to n. But:
    when number is divided by 3, print "fizz".
    when number is divided by 5, print "buzz".
    when number is divided by both 3 and 5, print "fizz buzz".
 Example

If n = 15, you should return:

[
  "1", "2", "fizz",
  "4", "buzz", "fizz",
  "7", "8", "fizz",
  "buzz", "11", "fizz",
  "13", "14", "fizz buzz"
]


 */

public class Problem3 {

	public static void main(String[] args) {
		printNumbers(15);
		System.out.println(printNumbersAsArray(15));
	}

	static void printNumbers(int n) {
		for (int i = 1; i <= n; i++) {
			if (i % (3 * 5) == 0)
				System.out.println("fizz buzz");
			else if (i % 3 == 0)
				System.out.println("fizz");
			else if (i % 5 == 0)
				System.out.println("buzz");
			else
				System.out.println(i);
		}
	}

	static ArrayList<String> printNumbersAsArray(int n) {
		ArrayList<String> resultList = new ArrayList<String>();
		for (int i = 1; i <= n; i++) {
			if (i % (3 * 5) == 0)
				resultList.add("fizz buzz");
			else if (i % 3 == 0)
				resultList.add("fizz");
			else if (i % 5 == 0)
				resultList.add("buzz");
			else
				resultList.add(String.valueOf(i));
		}
		return resultList;
	}

}
