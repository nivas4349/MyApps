

/**
 * @author: Siva Srinivasa Pasam Jun 9, 2020
 *
 */
public class SingletonImpl {
	private static SingletonImpl INSTANCE;

	private SingletonImpl() {

	}

//	public synchronized SingletonImpl getInstance() {
//		if (INSTANCE == null) {
//			INSTANCE = new SingletonImpl();
//		}
//		return INSTANCE;
//	}

	public static SingletonImpl getInstance() {
		if (INSTANCE == null) {
			synchronized (SingletonImpl.class) {
				if (INSTANCE == null) {
					INSTANCE = new SingletonImpl();
				}
			}
		}
		return INSTANCE;
	}
}
