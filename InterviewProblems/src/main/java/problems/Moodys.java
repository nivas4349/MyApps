package main.java.problems;

import java.util.HashMap;

public class Moodys {
	/*
	 * Find a number in a rotated sorted array.
	 * 
	 * 10 20 25 35 38 50 70
	 * 
	 * 70 10 20 ....
	 * 
	 * 38 50 70 10 20 25 35
	 * 
	 * 70 10 20 25 35 38 50 - find num - 70
	 * 
	 * 
	 * 
	 * Sol:
	 */
	// 1. Pick the center of the array and decid
	public int getIndex(int[] inp, int findNum) {
	String direction = "";
	if (findNum==inp[inp.length/2])
	return inp.length/2;
	else if(findNum>inp[inp.length/2])
	direction = "r";
	else direction = "l";

	if (direction.equals("r")) {
	for(int i=inp.length/2; i<inp.length;i++){
		
	}
	}
	
	return 0;
	}

	/*
	 * 2. We have coins - nickel(5 cents) , dime (10 cents), quarter (25 cents)
	 * - 15 max
	 * 
	 * I have to get $4.35
	 * 
	 * quarter - 17 dime - 1 nickel - 0 cent
	 */

	public void printDenominations(int[] denomArray,double dollarValue) {
	int remainingCents = (int) (dollarValue*100);
	HashMap<Integer,Integer> finalMap = new HashMap<>();
	int count=0;
	for (int i=denomArray.length-1;i>=0;i--){
	count = (int) remainingCents/denomArray[i];
//	if
	remainingCents = remainingCents%denomArray[i];
	finalMap.put(denomArray[i],count);
	if(remainingCents<denomArray[0]){
	break;
	}
	}

//	Find with the minimum of coins
}
}
