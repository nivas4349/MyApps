
public class ArrayUnion {

	public static void main(String[] args) {
		String[] array1 = { "a", "b", "c", "d" };
		String[] array2 = { "e", "f", "g", "h" };

		String[] array = new String[array1.length + array2.length];
		for (int i = 0; i < array.length; i++) {
			if (i < array1.length)
				array[i] = array1[i];
			else
				array[i] = array2[i - array1.length];
		}

		for (int i = 0; i < array.length; i++)
			System.out.println(array[i]);
	}

}
