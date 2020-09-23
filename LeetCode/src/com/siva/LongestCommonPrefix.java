package com.siva.leetcode;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		LongestCommonPrefix lcp = new LongestCommonPrefix();
		String[] strs = { "sivareddy", "sivsri", "sivs ri", "sivasri", "sivapasam", "sivaspasam", "sisreddy",
				"siva spasam", "siv a" };
		String[] strs4 = { "", null };
		String[] strs1 = { "sivareddy", "" };
		String[] strs2 = { " sivareddy", " " };
		String[] strs3 = { " ", "sivareddy" };
		System.out.println(lcp.longestCommonPrefix(strs));
	}

	public String longestCommonPrefix(String[] strs) {
		if (strs.length==0)
            return "";
		if (strs[0] == null || strs[0].equals(""))
			return strs[0];
		String common = strs[0];
		for (int i = 1; i < strs.length; i++) {
			if (strs[i] == null || strs[i].equals(""))
				return strs[i];
			common = commonPrefix(common, strs[i]);
		}
		return common;
	}

	public String commonPrefix(String s1, String s2) {
		int l = s1.length() <= s2.length() ? s1.length() : s2.length();
		int i = 0;
		for (; i < l; i++) {
			if (s1.charAt(i) != s2.charAt(i))
				break;
		}
		return s1.substring(0, i);
	}
}
