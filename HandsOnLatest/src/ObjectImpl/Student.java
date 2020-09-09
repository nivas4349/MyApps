package ObjectImpl;

/**
 * @author: Siva Srinivasa Pasam
 *
 */
public class Student {
	int id;
	int age;
	static int houseNum;
	StudentMom sm = new StudentMom();
	int p = sm.i;
	int q = StudentMom.j;

	public Student(int id, int age) {
		this.id = id;
		this.age = age;
	}

	static class StudentMom {
		String momsName;
		Student s = new Student(10, 20);
		int i = s.id;
		static int j = houseNum;
	}
}
