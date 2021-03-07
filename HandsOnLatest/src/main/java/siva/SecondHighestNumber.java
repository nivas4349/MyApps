package main.java.siva;

/**
 * @author: Siva Srinivasa Pasam
 *
 */
public class SecondHighestNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SecondHighestNumber sol = new SecondHighestNumber();
		int[] n = {11,33,44,66,66,55,22};
		int[] n1 = {123444, 13223, 23232, 1,2,3,12345567, 12345};
		System.out.println(sol.getSecondLargest(n));
		System.out.println(sol.getSecondLargest(n1));
	}
	
	public int getSecondLargest (int[] nums) {
		int largest =0;
		int secondLargest = 0;
		for (int num : nums) {
			if (num>largest) {
				secondLargest = largest;
				largest = num;
			} else if(num!=largest && num>secondLargest){
				secondLargest = num;
			}
		}
		return secondLargest;
	}

}
