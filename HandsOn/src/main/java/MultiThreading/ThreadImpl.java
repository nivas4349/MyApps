package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: Siva Srinivasa Pasam Jun 17, 2020
 *
 */
public class ThreadImpl implements Runnable {

	private String name;

	ThreadImpl(String name) {
		this.name = name;

	}

	@Override
	public void run() {
		System.out.println("Syso" + name);
	}

	private void psvm() {
		ExecutorService es = Executors.newSingleThreadExecutor();
		ExecutorService es1 = Executors.newFixedThreadPool(1);
	}
}
