
public class ImmutableString {
	public static void main(String args[]) {
		String s = "Let’s test";

		s.concat("if the String object is IMMUTABLE");
		System.out.println(s);

		s = s.concat("if the String object is IMMUTABLE");
		System.out.println(s);
	}
}
