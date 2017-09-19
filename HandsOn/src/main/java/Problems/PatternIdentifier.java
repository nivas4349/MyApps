package src.main.java.Problems;

import java.util.ArrayList;
import java.util.List;

public class PatternIdentifier {

	public static void main(String[] args) {
		System.out.println(patternResult("abcbb2deffert"));
		System.out.println(patternResult("abcdegughjthh"));
		System.out.println(patternResult("abcdegughjt"));
	}

	public static List<String> patternResult(String str) {
		char currChar = str.charAt(0);
		List<String> resStr = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			if (i == 0) {
				// do nothing
				continue;
			} else if (currChar != str.charAt(i))
				currChar = str.charAt(i);
			else
				resStr.add(String.valueOf(currChar) + String.valueOf(str.charAt(i)));
		}
		return resStr;
	}

}
