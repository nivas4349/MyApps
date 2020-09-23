package objectimpl;

/**
 * @author: Siva Srinivasa Pasam
 *
 */
public class StudentImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student s1 = new Student(1, 30);
		Student s2 = s1;
		System.out.println(s1 == s2);// True, False
		System.out.println(s1.equals(s2));// True, True
		System.out.println(s1.toString() == s2.toString());//True,True 
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.hashCode() == s2.hashCode());
		System.out.println(s1.toString().equals(s2.toString()));//True,True 
		s2 = new Student(1, 30);
		System.out.println(s1 == s2);//False, False
		System.out.println(s1.equals(s2));//True, True
		System.out.println(s1.toString() == s2.toString());//False, False
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s1.toString().equals(s2.toString()));//False, True
	}
	
	public void dont() {
		System.out.println("dont");
		finally {
			System.out.println("siva");
		}
	}

}
