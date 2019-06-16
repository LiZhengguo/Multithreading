package multithreading.chapter2.test2.t4;

public class MyThreadB extends Thread{

	private ObjectService obj ;
	
	public MyThreadB (ObjectService obj) {
		this.obj = obj;
	}
	
	public void run() {
		obj.serviceMethodB();
	}
}
