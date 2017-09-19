package src.main.java.MultiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureAndExecutorService {

	public static void main(String[] args) {

		ExecutorService es = Executors.newFixedThreadPool(3);
		CompletionService<Object> cs = new ExecutorCompletionService<Object>(es);
		List<Future> futures = new ArrayList<Future>();
		System.out.println("Before adding futures");
		futures.add(cs.submit(new Callable<Object>() {
			public Object call() throws InterruptedException {
				Thread.sleep(10000);
				System.out.println("Waited for 10000 milliseconds in first executor");
				return null;
			}
		}));

		futures.add(cs.submit(new Callable<Object>() {
			public Object call() throws Exception {
				Thread.sleep(2000);
				System.out.println("Waited for 2000 milliseconds in second executor");
				return null;
			}
		}));

		futures.add(cs.submit(new Callable<Object>() {
			public Object call() throws InterruptedException {
				Thread.sleep(15000);
				System.out.println("Waited for 15000 milliseconds in third executor");
				return null;
			}
		}));

		futures.add(cs.submit(new Callable<Object>() {
			public Object call() throws Exception {
				Thread.sleep(20000);
				System.out.println("Waited for 20000 milliseconds in fourth executor");
				return null;
			}
		}));

		// note that threadPool size is 3 where as we submitted 4 callable
		// tasks, meaning size of future list is 4

		System.out.println("Before getting futures");
		int i = 0;
		try {
			for (Future<?> future : futures) {
				i++;
				future.get();
				System.out.println("in for loop : " + i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("in finally block");
			es.shutdown();
		}
	}

}
