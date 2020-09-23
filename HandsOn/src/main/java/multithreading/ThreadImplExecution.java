package multithreading;

/**
 * @author: Siva Srinivasa Pasam
 * Jun 17, 2020
 *
 */
public class ThreadImplExecution {

	public static void main(String[] args) throws InterruptedException {
		ThreadImpl t1 = new ThreadImpl("Thread 1");
		ThreadImpl t2 = new ThreadImpl("Thread 2");
		ThreadImpl t3 = new ThreadImpl("Thread 3");
		
		//Let t3 wait for t2 to be done
		new Thread(t2).start();
		(new ThreadImpl("Siva")).st
//		Thread.sleep(3000);
		
		//Let t2 notify t1 once it's execution is done
		
		//Let t2 notify all once it's execution is done
	}

}
