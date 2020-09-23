package com.siva.leetcode;

public class PalindromeInteger {

	public static void main(String[] args) {
		System.out.println(Math.pow(2, 31));
		PalindromeInteger pi = new PalindromeInteger();
		int x = -2147447412;
		System.out.println(pi.isPalindrome(x));
	}

	public boolean isPalindrome(int x) {
		if (x < 0)
			return false;
		int num = x, result = 0, newResult = 0;
		while (x != 0) {
			int tail = x % 10;
			newResult = result * 10 + tail;
			if ((newResult - tail) / 10 != result)
				return false;
			result = newResult;
			x /= 10;
		}
		return result == num;
	}
}
