import java.util.HashMap;

public class FruitCount {

	public static void main(String[] args) {
		System.out.println(fruitCount("Grapes,Apple,Apple,Banana,Apple"));
	}

	static HashMap<String, Integer> fruitCount(String input) {
		HashMap<String, Integer> result = new HashMap<>();
		String[] inputArray = input.split(",");
		for (String in : inputArray) {
			System.out.println(result.get(in));
			result.put(in, ((result.get(in) == null) ? 0 : result.get(in)) + 1);
		}
		return result;
	}

	/*
	 * static HashMap<String, Integer> fruitCount(String input) {
	 * HashMap<String, Integer> result = new HashMap<>(); String[] inputArray =
	 * input.split(","); for (String in:inputArray) { result.put(in,1); } return
	 * result; }
	 */

}
