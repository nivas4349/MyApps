import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author: Siva Srinivasa Pasam Jun 9, 2020
 *
 */
public class ReturnPairCountThatHasDifferenceK {

	public static void main(String[] args) {
		int[] i = { 1, 2, 2, 2, 3, 3, 3, 4, 5, 6 };
		int[] j = { 6, 5, 4, 3, 2, 1 };
		System.out.println(getPairCount(i, 2));
		System.out.println(getPairCount(j, 2));
		System.out.println(getPairCount(j, 3));
	}

	public static int getPairCount(int[] j, int k) {
		int result = 0;
		Set<Integer> s = new HashSet<Integer>();
		for (int i : j) {
			s.add(i);
		}
		Iterator itr = s.iterator();
		Set<Integer> s1 = new HashSet<Integer>();
		while (itr.hasNext()) {
			int n = (int) itr.next();
			if (s1.contains(n)) {
				result++;
			} else {
				s1.add(Math.addExact(k, n));
			}
		}
		return result;
	}
	
}
