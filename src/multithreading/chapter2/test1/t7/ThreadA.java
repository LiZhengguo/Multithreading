package multithreading.chapter2.test1.t7;

public class ThreadA extends Thread{

	private Service service;
	
	public ThreadA (Service service) {
		this.service = service;
	}
	
	public void run() {
		service.testMethod();
	}
}
