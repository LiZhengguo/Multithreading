package multithreading.chapter2.test2.t5;

public class MyThreadA extends Thread{

	private Service service ;
	
	public MyThreadA(Service service) {
		this.service = service;
	}
	
	public void run() {
		service.setUserNamePassword("a", "aa");
	}
}
