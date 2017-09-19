package src.main.java.HackerRank;

import java.util.Scanner;

/* Task: Given the meal price (base cost of a meal), tip percent 
 * (the percentage of the meal price being added as tip), and tax percent 
 * (the percentage of the meal price being added as tax) for a meal, 
 * find and print the meal's total cost.*/

/*Ex: Sample Input: 12.00
20
8

Sample Output: The total meal cost is 15 dollars.
*/

public class Day2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double mealCost = scan.nextDouble();
		int tipPercent = scan.nextInt();
		int taxPercent = scan.nextInt();
		scan.close();

		int totalCost = (int) Math.round(
				mealCost + (mealCost * (((double) tipPercent) / 100)) + (mealCost * (((double) taxPercent) / 100)));
		System.out.println("The total meal cost is " + totalCost + " dollars.");
	}

}
