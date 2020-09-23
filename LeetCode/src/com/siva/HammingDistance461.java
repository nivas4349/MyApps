/**
 * Dec 13, 2017, 3:34:32 PM
 * @author SReddyP
 */
package com.siva.leetcode;

public class HammingDistance461 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HammingDistance461 hd = new HammingDistance461();
		System.out.println(hd.getHammingDistanceUsingFunction(10, 9));
		System.out.println(getHammingDistanceWithoutUsingFunction(14, 7));
		System.out.println(hd.getHammingDistanceWithoutUsingFunction(17, 14));
		// System.out.println(240 << 2);
		// System.out.println( << 2);

		// System.out.println(hd.getHighestInt(30)); // this is the highest possible
		// integer
		// System.out.println(hd.getHighestInt(31));
		// System.out.println(hd.getHighestInt(32));

		// int i = Double.MAX_EXPONENT; //1023
		// int i = 1022;
		// System.out.println(hd.getHighestDouble(i));
		// System.out.println(hd.getHighestDouble(i + 1));
		// System.out.println(Double.MAX_VALUE);

		// System.out.println(240 >> 2);
		// System.out.println(17 >>> 2);
		// System.out.println(~50);
		// System.out.println("Hamming distance is : " + hd.getHammingDistance(1, 4));
	}

	private int getHammingDistanceUsingFunction(int x, int y) {
		return Integer.bitCount(x ^ y);
	}

	private static int getHammingDistanceWithoutUsingFunction(int x, int y) {
		int count = 0, xor = x ^ y;
		for (int i =0; i<32;i++) {
//			(xor >> i) & 1;
		}
		return count;
	}

	private int getHighestInt(int j) {
		int value = 0;
		for (int i = 0; i <= j; i++) {
			value += Math.pow(2, i);
		}
		return value;
	}

	// same logic of getHighestInt doesn't apply for this, as the max exponent
	// possible is 1023 not 1022. Not sure about the reason
	private double getHighestDouble(int j) {
		double value = 0;
		for (int i = j; i >= 0; i--) {
			value += Math.pow(2, i);
		}
		return value;
	}

}
