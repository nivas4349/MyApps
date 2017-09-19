
public class MultiDimensionalArray {

	static char[][] charArray = { { 'a', 'b', 'c', 'd', 'e' }, { 'x', 'y' }, { 'p', 'q', 'r', 's' } };

	public static void main(String[] args) {
		// for (int i=0;i<charArray.)
		System.out.println("Size of charrray " + charArray.length);
		System.out.println("Size of 1st element of charrray " + charArray[0].length);
		System.out.println("Size of 2nd element of  charrray " + charArray[1].length);
		System.out.println(charArray[0][3]);// should print d
	}

}
