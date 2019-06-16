package multithreading.chapter2.test2.t4;

public class MyThreadA extends Thread{

	private ObjectService obj ;
	
	public MyThreadA (ObjectService obj) {
		this.obj = obj;
	}
	
	public void run() {
		obj.serviceMethodA();
	}
}
