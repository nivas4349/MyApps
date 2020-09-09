package StringImpl;

import java.util.StringJoiner;
import java.util.StringTokenizer;

/**
 * @author: Siva Srinivasa Pasam Jun 28, 2020
 *
 */
public class StringDetails {

	public static void main(String args[]) {
		String str = new String("Siva");
		String str3 = new String("Siva");
		String str4 = new String("Daddy");
		String str1 = "Madhu";
		String str2 = "Madhu";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());

		System.out.println(str.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		str.trim().toUpperCase().toCharArray();
		String str5 = str.replace("S", "Z");
		String str6 = "Ziva";
		String str7 = str.toUpperCase();
		String str8 = "SIVA";
		System.out.println(str);
		System.out.println(str.hashCode());
		System.out.println(str.toString());
		System.out.println(str5);
		System.out.println(str5.hashCode());
		System.out.println(str6);
		System.out.println(str6.hashCode());
		System.out.println(str7);
		System.out.println(str7.hashCode());
		System.out.println(str8);
		System.out.println(str8.hashCode());
		int i = 10;
		Integer.parseInt("12");
		Integer.getInteger("12");
		
		String[] strArray = "Siva$$Madhu$$Siva$$Madhu$$Siva$$Madhu$$Siva$$Madhu$$Siva$$Madhu$$".split("$$");
		for (String s : strArray) {
			
		}
		
//		String
//		StringJoiner
		StringTokenizer tokenizer = new StringTokenizer("Siva$$Madhu$$Siva$$Madhu$$Siva$$Madhu$$Siva$$Madhu$$Siva$$Madhu$$","$$");
		System.out.println(tokenizer);
		while(tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken());
			System.out.println(tokenizer.nextElement());
			System.out.println(tokenizer.nextElement().toString());
		}
	}
}