
public class BinarySearchOfASortedArray {

	public static void main(String[] args) {
		System.out.println(String.valueOf('a'));

		int[] num = { 3, 6, 9, 11, 13, 15, 16, 23, 66 };
		int key = 23;
		System.out.println(key + " : " + find(num, key));
		key = 9;
		System.out.println(key + " : " + find(num, key));
		key = 66;
		System.out.println(key + " : " + find(num, key));
		key = 2;
		System.out.println(key + " : " + find(num, key));
		key = 68;
		System.out.println(key + " : " + find(num, key));
	}

	static private int find(int[] nums, int key) {
		int minIndex = 0;
		int maxIndex = nums.length - 1;
		int curIndex;
		while (true) {
			curIndex = (minIndex + maxIndex) / 2;
			if (nums[curIndex] == key)
				return curIndex;
			if (minIndex > maxIndex)
				return -1;
			if (nums[curIndex] < key)
				minIndex = curIndex + 1;
			else
				maxIndex = curIndex - 1;
		}
	}
}
