package multithreading.chapter2.test2.t9;

public class ThreadA extends Thread{
	
	private  Service service;
	public ThreadA(Service service) {
		this.service = service;
	}
	public void run() {
		service.printA();
	}
	
}
