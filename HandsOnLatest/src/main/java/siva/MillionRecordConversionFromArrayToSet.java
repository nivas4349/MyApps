package main.java.siva;

import pojos.Student;

/**
 * @author SReddyP
 *
 *         Program to identify duplicates from a huge dataset (Arraylist)
 */

public class MillionRecordConversionFromArrayToSet {

	public static void main(String[] args) {
		Student st;
		for (int i = 1; i < 500; i++) {
			st = new Student();
//			if ()
			st.setId(i);
			st.setFName("Siva" +i);
			st.setFName("Pasam" +i);
		}
	}

}
