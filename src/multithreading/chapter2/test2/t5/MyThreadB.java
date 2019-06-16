package multithreading.chapter2.test2.t5;

public class MyThreadB extends Thread{

	private Service service ;
	
	public MyThreadB(Service service) {
		this.service = service;
	}
	
	public void run() {
		service.setUserNamePassword("b", "bb");
		service.b();
	}
}
