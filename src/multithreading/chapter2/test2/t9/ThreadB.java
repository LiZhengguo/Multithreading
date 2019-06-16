package multithreading.chapter2.test2.t9;

public class ThreadB extends Thread{
	
	private  Service service;
	public ThreadB(Service service) {
		this.service = service;
	}
	public void run() {
		service.printB();
	}
	
}
