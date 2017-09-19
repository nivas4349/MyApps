package src.main.java.MultiThreading;

public class QueueSharedResource {
	int queueSize = 5;
	int occupiedSize = 0;
	
	void putObject() {
		occupiedSize++;
	}
	
	void removeObject() {
		occupiedSize--;
	}
}
