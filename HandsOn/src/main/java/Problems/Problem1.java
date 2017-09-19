package src.main.java.Problems;

/* Task: If sum of more than 2 integers = t, then return true.
 * if none, return false*/

public class Problem1 {

	public static void main(String[] args) {
		int ta = 20;
		int[] a = { 23, 5, 4, 7, 2, 11 };
		int tb = 8;
		int[] b = { 1, 3, 5, 23, 2 };
		int tc = 7;
		System.out.println(isSumT(a, ta));
		System.out.println(isSumT(b, tb));
		System.out.println(isSumT(b, tc));
	}

	static boolean isSumT(int[] seq, int t) {
		int currentIndex = 0;
		int currentSum = 0;
		for (int i = 0; i < seq.length; i++) {
			if (seq[i] > t) {
				currentSum = 0;
				currentIndex = seq[i];
			} else if (currentSum < t) {
				currentSum += seq[i];
				if (currentSum == t)
					return true;
				else if (currentSum > t) {
					for (int j = currentIndex; currentIndex < seq.length - 1; j++) {
						currentSum = currentSum - seq[j];
						if (currentSum == t)
							return true;
						// currentIndex=++currentIndex;
					}
				}
			}
		}
		return false;
	}
}
