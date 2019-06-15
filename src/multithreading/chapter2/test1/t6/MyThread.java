package multithreading.chapter2.test1.t6;

public class MyThread extends Thread{
	
	public void run() {
		Service service = new Service();
		service.service1();
	}
}
