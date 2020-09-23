/**
 * @author: Siva Srinivasa Pasam
 * Jun 12, 2020
 *
 */
public class StringBufferVsStringBuilder {

	public static B b = new B();
	B b1 = new B();
	public static String str= new String("Siva");
	
	public static void main(String[] args) {
		MyTask.b.c();
		String s = "Siva";
		String s1 = "Siva";
		String s2 = new String("Siva");
		String s3 = new String("Siva");
		
		System.out.println(s==s1);
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s==s1);
		
		StringBufferVsStringBuilder sb = new StringBufferVsStringBuilder();
		b.c();
		System.out.println(b);
		System.out.println(sb.b1);
		System.out.println(b);
	}

}
