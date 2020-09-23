package com.siva.leetcode;

public class ReverseVowelsOfAString {

	public static void main(String[] args) {
		String s = "hello";
		String s1 = "race car";
		ReverseVowelsOfAString vow = new ReverseVowelsOfAString();
		// System.out.println(vow.swapVowels(s1));
		System.out.println(vow.reverseVowels(s1));
		System.out.println("Space"+vow.reverseVowels(" ")+"Space");
	}

	public String swapVowels(String s) {
		char[] c = s.toCharArray();
		boolean holdPointer1 = false, holdPointer2 = false;
		int pointer1 = 0, pointer2 = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u' || c[i] == 'A' || c[i] == 'E'
					|| c[i] == 'I' || c[i] == 'O' || c[i] == 'U') {
				if (!holdPointer1) {
					pointer1 = i;
					holdPointer1 = true;
				} else {
					pointer2 = i;
					holdPointer2 = true;
				}
			}
			if (holdPointer1 && holdPointer2) {
				char temp = c[pointer1];
				c[pointer1] = c[pointer2];
				c[pointer2] = temp;
				pointer1 = pointer2;
				holdPointer2 = false;
			}
		}
		return String.valueOf(c);
	}

	public String reverseVowels(String s) {
		if (s==null||s.trim().equals(""))
			return s;
		final String vowels = "aeiouAEIOU";
		char[] c = s.toCharArray();
		int start = 0, end = s.length() - 1;
		while (start < end) {
			while (start < end && !vowels.contains(c[start] + "")) {
				start++;
			}
			while (start < end && !vowels.contains(c[end] + "")) {
				end--;
			}
			char temp = c[start];
			c[start] = c[end];
			c[end] = temp;

			start++;
			end--;
		}
		return new String(c);
	}
}
