/**
 * @author: Siva Srinivasa Pasam
 *
 */
public class InplaceIntegerValueSwapping {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InplaceIntegerValueSwapping inplace = new InplaceIntegerValueSwapping();
		inplace.swapInPlace(1,12);
		inplace.swapInPlace(145,18);
	}
	
	public void swapInPlace(int i, int j) {
		i=i+j;
		j=i-j;
		i=i-j;
		System.out.println("i = "+i);
		System.out.println("j = "+j);
	}

}
