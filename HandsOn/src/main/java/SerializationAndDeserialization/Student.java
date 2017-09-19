package src.main.java.SerializationAndDeserialization;

import java.io.Serializable;

public class Student implements Serializable {
	int id;
	String name;
	transient int age;// it won't be serialized and default value is what we get
						// when we deserialize it, in this case default value is
						// zero

	static String company = "SSS IT Pvt Ltd";// it won't be serialized

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
}