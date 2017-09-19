package src.main.java.MultiThreading;

public class MyRunnableImplementation implements Runnable {
	public void run() {
		System.out.println("Executing thread " + Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			for (int j = 1; j <= 1000; j++) {
			}
			System.out.println("Thread : " + Thread.currentThread().getName() + " is in Iteration : " + i);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new MyRunnableImplementation(), "myRunnable1");
		Thread t2 = new Thread(new MyRunnableImplementation(), "myRunnable2");
		t1.start();
		System.out.println(Thread.currentThread().getName());
		Thread.sleep(5000);
		t2.start();
		System.out.println(Thread.currentThread().getName());
	}
}
