package multithreading.chapter2.test2.t9;

public class ThreadC extends Thread{
	
	private  Service service;
	public ThreadC(Service service) {
		this.service = service;
	}
	public void run() {
		service.printC();
	}
	
}
