package src.main.java.HackerRank;

import java.util.Scanner;

/* Task: The variables i, d, and s are already declared and initialized for you. You must:

Declare variables: one of type int, one of type double, and one of type String.
Read  lines of input from stdin (according to the sequence given in the Input
 Format section below) and initialize your  variables.
Use the + operator to perform the following operations: 
Print the sum of i plus your int variable on a new line.
Print the sum of d plus your double variable to a scale of one decimal place on a new line.
Concatenate s with the string you read as input and print the result on a new line.*/

/*Ex: Sample Input: 12
4.0
is the best place to learn and practice coding!

Sample Output: 16
8.0
HackerRank is the best place to learn and practice coding!
*/

public class Day1 {

	public static void main(String[] args) {
		int i = 144;
		double d = 24.0;
		String s = "Siva Sri ";
		Scanner scan = new Scanner(System.in);
		// Declare variables: one of type int, one of type double, and one of
		// type String.
		int j;
		double e;
		String t;

		// Read lines of input from stdin (according to the sequence given in
		// the Input
		j = scan.nextInt();
		e = scan.nextDouble();
		scan.nextLine();
		t = scan.nextLine();
		
		scan.close();

		System.out.println(i + j);
		System.out.println(d + e);
		System.out.println(s + t);
	}

}
