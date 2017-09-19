
public class HashCodeString {

	public static void main(String[] args) {
		String s1 = "Osman";
		String s2 = "osman";

		System.out.println(s2.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode() == s2.hashCode());

		s2 = "Osman";
		System.out.println(s2.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode() == s2.hashCode());

		HashCodeString h1 = new HashCodeString();
		HashCodeString h2 = new HashCodeString();
		System.out.println(h1.equals(h2));
	}

}
