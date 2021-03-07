package main.java.siva;

/**
 * @author: Siva Srinivasa Pasam
 * Jun 10, 2020
 *
 */
public interface Interf {
	int sum();
	
	int sum1();
	default public int age() {
		return 10;
	}
	
	default public int age1() {
		return 10;
	}
}
