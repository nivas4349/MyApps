package main.java.problems;

import java.util.Date;

public class SoFiBigO {

	public static void main(String[] args) {
		long currentDate = new Date().getTime();
		long num = 48;
		System.out.println(fibonacci(num));
		System.out.println("Time taken for Completion : " + (new Date().getTime() - currentDate) / 1000);

		currentDate = new Date().getTime();
		System.out.println(fibonacciFor(num));
		System.out.println("Time taken for Completion : " + (new Date().getTime() - currentDate) / 1000);
	}

	private static long fibonacci(long num) {
		if (num == 0L)
			return 0L;
		if (num == 1L)
			return 1L;
		return fibonacci(num - 1) + fibonacci(num - 2);
	}

	private static long fibonacciFor(long num) {
		long res = 1;
		long prevValue = 1;
		for (long i = 3L; i <= num; i++) {
			// if (i)
			// continue;
			res += prevValue;
			prevValue = res - prevValue;
		}
		return res;
	}
}