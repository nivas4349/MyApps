package com.siva.leetcode;

import java.util.Stack;

public class ValidParanthesis20 {

	public static void main(String[] args) {
		ValidParanthesis20 vp = new ValidParanthesis20();
		String v1 = "{}[()]";
		String v2 = "{{()}[]}";
		String v3 = "{{( )}[]}"; // with space
		System.out.println(vp.isValid(v2));
	}

	public boolean isValid(String s) {
		Stack<Character> st = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(')
				st.push(')');
			else if (c == '{')
				st.push('}');
			else if (c == '[')
				st.push(']');
			else if (st.isEmpty() || st.pop() != c)
				return false;
		}
		return st.isEmpty();
	}

}
