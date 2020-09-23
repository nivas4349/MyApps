

import java.util.ArrayList;
import java.util.List;

/**
 * Java program to print all the combinations of a String for ex: for a given
 * string 'abc' you should print 'a','b','c','ab','bc','ac','abc'
 */

public class StringCombinations {

	public static void main(String[] args) {
		StringCombinations sc = new StringCombinations();
		int[] nums = {1,2,3,4};
		System.out.println(sc.permute(nums));
		String st = "abc";
		printStringCombinations(st);
	}

	static void printStringCombinations(String str) {
		List<String> combinations = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			// TODO - I don't think it is the right approach
			combinations.addAll(stringCombinations(str.substring(0, i)));
		}
		for (String combination : combinations) {
			System.out.println(combination);
		}
	}

	static List<String> stringCombinations(String input) {
		List<String> resultList = new ArrayList<>();

		return resultList;
	}

	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		backtrack(list, new ArrayList<>(), nums);
		return list;
	}

	private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums) {
		if (tempList.size() == nums.length) {
			list.add(new ArrayList<>(tempList));
		} else {
			for (int i = 0; i < nums.length; i++) {
				if (tempList.contains(nums[i]))
					continue; // element already exists, skip
				tempList.add(nums[i]);
				backtrack(list, tempList, nums);
				tempList.remove(tempList.size() - 1);
			}
		}
	}

}
