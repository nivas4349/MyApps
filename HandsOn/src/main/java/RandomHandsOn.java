

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import org.apache.commons.lang3.StringUtils;

/**
 * @author: Siva Srinivasa Pasam
 *
 */
public class RandomHandsOn {
	private static PostIncrementVsPreIncrement ps = null;
	static int numb;
	static char c;

	public static void main(String arg[]) {
		int[] i = new int[1];
		System.out.println(i[0]);
		i[0]++;
		System.out.println(i[0]);

		int number = 10;
		int newInt = ++number;
		System.out.println(newInt);
		System.out.println(number);

//		List<String> list = null;
//		for (String str : list) {
//			System.out.println(str);
//		}

		String s = new String("Siva");
		"Dhoni".isEmpty();
		System.out.println(StringUtils.replace(s, "i", null));
		System.out.println(StringUtils.replace(s, "i", "I"));
		System.out.println(s);

		int hex = 0x000F;
		System.out.println(hex);
		int hex1 = 0x2222;
		System.out.println(hex1);
		System.out.println(hex & hex1);

		ps = new PostIncrementVsPreIncrement();
		System.out.println(ps);
		System.out.println(numb);
		System.out.println("char:" + c);
		String sp = "char:" + c;

		int[] in = { 1, 2 };
		int[] in1 = { 1, 2 };

		System.out.println(in == in1);
		List<String> list = Arrays.asList("Geeks");
		Predicate<String> p = (s)->s.startsWith("G");

	}
}
