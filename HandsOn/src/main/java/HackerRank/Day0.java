package src.main.java.HackerRank;

import java.util.Scanner;

/* Task: To complete this challenge,you must save a line of input from stdin
 *  to a variable,print Hello,World.on a single line,and finally print
 *   the value of your variable on a second line. */

/*Ex: Sample Input:
Welcome to 30 Days of Code!

Sample Output:
Hello, World. 
Welcome to 30 Days of Code!
*/
public class Day0 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		scan.close();
		System.out.println("Hello, World.");
		System.out.print(str);
	}
}