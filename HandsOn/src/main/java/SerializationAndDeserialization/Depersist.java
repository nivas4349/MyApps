package src.main.java.SerializationAndDeserialization;

import java.io.*;

class Depersist {
	public static void main(String args[]) throws Exception {

		ObjectInputStream in = new ObjectInputStream(
				new FileInputStream("src/main/java/SerializationAndDeserialization/f.txt"));
		Student s = (Student) in.readObject();
		System.out.println(s.id + " " + s.name + " " + s.age + " " + s.company);

		in.close();
	}
}