package main.java.problems;

public class SoFi2 {
	private static boolean ready;
	private static int number;

	private static class ReaderThread extends Thread {
		public void run() {
			int i = 0;
			while (!ready) {
				i++;
				System.out.println("In While Loop" + i);
				Thread.yield();
			}
			System.out.println(number); // Will this execute?
		}
	}

	public static void main(String[] args) {
		new ReaderThread().start();
		number = 42;
		ready = true;
	}
}
