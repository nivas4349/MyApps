package com.siva.leetcode;

public class CountandSay38 {
	///////Incomplete/////////

	public static void main(String[] args) {
		CountandSay38 cs = new CountandSay38();
		System.out.println(cs.countAndSay(4));
	}

	public String countAndSay(int n) {
		if (n <= 0)
			return "";
		String res = "1";
		if (n == 1)
			return res;
		for (int i = 1; i < n; i++) {
			String str = new String(res);
			res = "";
			for (int j = 0; j < str.length(); j++) {
				char cur = str.charAt(j);
				int count = 0;
				for (int k = j; k < str.length() && str.charAt(k) == cur; k++) {
					count++;
					j++;
				}
				res += String.valueOf(count) + String.valueOf(cur);
			}
			System.out.println(i+1 + " ==> " + res);
		}
		return res;
	}

}
