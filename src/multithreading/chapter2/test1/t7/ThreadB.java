package multithreading.chapter2.test1.t7;

public class ThreadB extends Thread{

	private Service service;
	
	public ThreadB (Service service) {
		this.service = service;
	}
	
	public void run() {
		service.testMethod();
	}
}
