package src.main.java.HackerRank;

import java.util.Scanner;

/* Task: Given a string, S, of length N that is indexed from 0 to N-1, print its 
 * even-indexed and odd-indexed characters as 2 space-separated strings on a 
 * single line (see the Sample below for more detail).

Note: 0 is considered to be an even index.

Input Format: The first line contains an integer, T (the number of test cases). 
Each line i of the T subsequent lines contain a String, S.

Constraints: 1<=T<=10
2<=length of S<=10000

Output Format: For each String Sj (where 0<=J<=T-1), print Sj's even-indexed
 characters, followed by a space, followed by Sj's odd-indexed characters.*/

/*Ex: Sample Input:
Hacker
Rank

Sample Output:
Hce akr
Rn ak
*/

public class Day6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		while (n >= 0) {
			String str = scan.nextLine();
			printString(str);
			n--;
		}
	}

	static void printString(String str) {
		String evenStr = "";
		String oddStr = "";
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 0) {
				evenStr = evenStr + str.charAt(i);
			} else {
				oddStr = oddStr + str.charAt(i);
			}
		}
		System.out.println(evenStr + " " + oddStr);
	}

}
