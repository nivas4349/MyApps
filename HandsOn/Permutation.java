import java.util.HashMap;

public class Permutation {

	public static void main(String[] args) {
		System.out.println(isPermutation("abc", "cba"));
		System.out.println(isPermutation("madam", "ammad"));
		System.out.println(isPermutation("siva","tria"));
	}

	static boolean isPermutation(String a, String b) {
		if (a.length() != b.length())
			return false;

		HashMap<Character, Integer> aHashMap = getOccurenceCount(a);
		HashMap<Character, Integer> bHashMap = getOccurenceCount(b);

		return aHashMap.equals(bHashMap);
	}

	public static HashMap<Character, Integer> getOccurenceCount(String str) {
		HashMap<Character, Integer> resultMap = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			char ch = str.charAt(i);
			if (resultMap.containsKey(ch))
				count = resultMap.get(ch);
			else
				count = 0;
			resultMap.put(ch, count + 1);
		}
		return resultMap;
	}

}
