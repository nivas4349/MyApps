

/**
 * @author: Siva Srinivasa Pasam
 *
 */
public class TrickyArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] intArray = {1,2,3,4,5,6,7,8,9};
		System.out.println(intArray.length);
		for (int i=4;i<intArray.length;i++) {
			intArray[i]=0;
		}
		System.out.println(intArray.length);
	}

}
