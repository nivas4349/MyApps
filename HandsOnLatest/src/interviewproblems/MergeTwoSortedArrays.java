package interviewproblems;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {

	}

	public static int[] mergeSortedArrays(int[] A, int m, int[] B, int n) {
		int i = m - 1, j = n - 1, k = m + n - 1;

		while (i > -1 && j > -1) {
			A[k--] = (A[i] < B[j]) ? B[j--] : A[i--];
		}
		return A;
	}
}
