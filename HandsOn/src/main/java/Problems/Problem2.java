package src.main.java.Problems;

/* Task: Why does the following program causes a deadlock*/

public class Problem2 {

	private static boolean y;

	static {
		final Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				y = true;
				System.out.println("inside run");
			}
		});

		t.start();

		try {
			t.join();
		} catch (Exception e) {

		}
	}

	public static void main(String[] args) {
		System.out.println(y);
	}

}