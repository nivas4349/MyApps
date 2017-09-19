package src.main.java.HackerRank;

import java.util.Scanner;

/* Task: Given an array, A, of N integers, print A's elements in reverse order 
 * as a single line of space-separated numbers.

Input Format: The first line contains an integer, N (the size of our array). 
The second line contains N space-separated integers describing array A's elements.

Constraints: 1<=N<=1000, 1<=Ai<=10000, where Ai is the Ith integer in the array.

Output Format: Print the elements of array A in reverse order as a single line
 of space-separated numbers.*/

/*Ex: Sample Input: 4
1 4 3 2

Sample Output: 2 3 4 1
*/

public class Day7 {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 1 };
		Day7 day = new Day7();
		day.printReverseOfAnArray(arr);

		/*
		 * Scanner scan = new Scanner(System.in); scan.nextLine(); String str =
		 * scan.nextLine(); System.out.println(printReverseString(str));
		 */

		// actual ask for Day7
		Scanner scan = new Scanner(System.in);
		int arraySize = scan.nextInt();
		int[] inputArr = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			inputArr[i] = scan.nextInt();
		}
		scan.close();
		day.printReverseOfAnArray(inputArr);
	}

	static String printReverseString(String str) {
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			res = str.charAt(i) + res;
		}
		return res;
	}

	String printReverseOfAnArray(int[] arr) {
		String res = "";
		for (int i = 0; i < arr.length; i++) {
			res = String.valueOf(arr[i]) + (i != 0 ? (" " + res) : "");
		}
		System.out.println(res);
		return res;
	}
}
