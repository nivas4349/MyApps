package com.siva.leetcode;

public class ReverseInteger {

	public static void main(String[] args) {
		int i = 1534236469;
		i = 1463847412;
		System.out.println(reverse(i));
	}

	public static int reverse(int x) {
		int result = 0;
		while (x != 0) {
			if (result > Integer.MAX_VALUE / 10 || result + (x % 10) > Integer.MAX_VALUE / 10
					|| result < Integer.MIN_VALUE / 10 || result + (x % 10) < Integer.MIN_VALUE / 10) {
				return 0;
			}
			result = result * 10 + x % 10;
			x = x / 10;
		}
		return result;
	}
}
