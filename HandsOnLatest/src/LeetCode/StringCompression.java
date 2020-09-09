package LeetCode;

/**
 * @author: Siva Srinivasa Pasam
 *
 */
public class StringCompression {
	//////////////////////////////////////////////////////////////////////////////
	// 				NOT SOLVED YET
	//////////////////////////////////////////////////////////////////////////////
	
	
	
	public static void main(String[] args) {
		StringCompression sc = new StringCompression();
		System.out.println(sc.compress(new char[]{'a','a','b','b','c','c','c'}));//[a,2,b,2,c,3]
		System.out.println(sc.compress(new char[]{'a','a','a','a','a','a','a','a','a','a','a','a','b','b','c','c','c'}));//[a,1,2,b,2,c,3]
//		System.out.println(sc.compress(new char[]{'a','b','c'}));//[a,b,c]
		System.out.println(sc.compress(new char[]{'a','a','a','a','a','a','a','a','a','a','a','a','b','c'}));//[a,1,2,b,c]
		System.out.println(sc.compress(new char[]{'a','b','b','c','c','c'}));//[a,b,2,c,3]
	}
	
	public int compress(char[] chars) {
		int currIndex = 1;
		char curr = chars[0];
		int counter = 1;
		for (int i = 1; i < chars.length; i++) {
			if (curr == chars[i]) {
				counter++;
			} else {
				if (counter == 1) {
					chars[currIndex] = chars[i];
					currIndex++;
				} else {
					curr = chars[i];
					if (counter <= 9) {
						currIndex++;
						chars[currIndex] = (char) (counter + '0');
						currIndex++;
					} else {
						int digits = 1;
						int temp = counter;
						while (temp / 10 > 0) {
							temp = temp / 10;
							digits++;
						}
						for (int j = currIndex + digits - 1; j >= currIndex; j--) {
							chars[j] = (char) ((counter % 10) + '0');
							counter = counter / 10;
						}
						currIndex = currIndex + digits;
					}
					counter = 1;
					chars[currIndex]=curr;
				}
			}
		}
		currIndex++;
		chars[currIndex]=(char) (counter + '0');
		for (int p = ++currIndex; p < chars.length; p++) {
			chars[p] = 0;
		}
		return currIndex;
	}
}
