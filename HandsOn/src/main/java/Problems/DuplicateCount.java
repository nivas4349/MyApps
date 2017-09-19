package src.main.java.Problems;

public class DuplicateCount {

	public static void main(String[] args) {
		int[] iArray = { 2, 3, 3, 4, 5, 6, 7, 8 };
		System.out.println(duplicateCount(iArray));
	}

	static int duplicateCount(int[] intArray) {
		int ans = 0;
		int previousValue = 0;
		// intArray = {2,3,6,7,7};
		// int[] indexArray = new int[intarray.length];

		for (int i = 0; i < intArray.length; i++) {
			// if (indexArray[intarray[i]] == 1) {
			if (previousValue == intArray[i]) {
				ans = intArray[i];
				break;
			}
			// indexArray[intarray[i]] = 1;
			previousValue = intArray[i];
		}

		return ans;
	}

}
