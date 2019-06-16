package multithreading.chapter2.test2.t4;

public class MyThreadC extends Thread{

	private ObjectService obj ;
	
	public MyThreadC (ObjectService obj) {
		this.obj = obj;
	}
	
	public void run() {
		obj.serviceMethodC();
	}
}
