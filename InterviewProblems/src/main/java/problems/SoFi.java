package main.java.problems;

import java.util.Arrays;
import java.util.List;

public class SoFi {
	public static void main(String[] args) {
		try {
			List ints = Arrays.asList(1, 2, 3);
			System.out.println(ints.get(4));
			System.exit(0);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
}
