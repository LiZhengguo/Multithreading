package multithreading.chapter2.test2.t9;

public class ThreadD extends Thread{
	
	private  Service service;
	public ThreadD(Service service) {
		this.service = service;
	}
	public void run() {
		service.printD();
	}
	
}
