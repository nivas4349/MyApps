package src.main.java.SerializationAndDeserialization;

import java.io.*;

class Persist {
	public static void main(String args[]) throws Exception {
		Student s1 = new Student(211, "ravi", 21);

		FileOutputStream fout = new FileOutputStream("src/main/java/SerializationAndDeserialization/f.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);

		out.writeObject(s1);
		out.flush();

		out.close();
		fout.close();

		System.out.println("success");
	}
}