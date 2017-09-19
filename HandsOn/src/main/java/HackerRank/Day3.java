package src.main.java.HackerRank;

import java.util.Scanner;

/* Task: Given an integer, n, perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not n is weird.*/

/*Ex: Sample Input:3
 * 24

Sample Output: Weird 
Not Weird
*/

public class Day3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		String answer = "";

		if (n % 2 == 1) {
			answer = "Weird";
		} else {
			if (n >= 2 && n <= 5)
				answer = "Not Weird";
			else if (n >= 6 && n <= 20)
				answer = "Weird";
			else if (n > 20)
				answer = "Not Weird";
		}
		System.out.println(answer);
	}

}
