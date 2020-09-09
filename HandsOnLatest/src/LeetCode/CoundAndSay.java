package LeetCode;

/**
 * @author: Siva Srinivasa Pasam
 *
 */
public class CoundAndSay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CoundAndSay cs = new CoundAndSay();
		System.out.println(cs.countAndSay(9));
	}

	public String countAndSay(int n) {
		if (n < 1 || n > 30)
			return "invalid input";
		String result = "1";
		for (int i = 2; i <= n; i++) {
			result = readOff(result);
		}
		return result;
	}

	private String readOff(String input) {
//	         //111221
//	         int digits= 1;
//	         while (input/10>0){
//	             input=input/10;
//	             digits++;
//	         }
		int counter = 1;
		char[] charArray = input.toCharArray();
		char curr = charArray[0];
		StringBuffer readValue = new StringBuffer();
		for (int i = 1; i < charArray.length; i++) {
			if (curr == charArray[i]) {
				counter++;
			} else {
				readValue = readValue.append(counter).append(curr);
				curr = charArray[i];
				counter = 1;
			}
		}
		return readValue.append(counter).append(curr).toString();
	}

}
