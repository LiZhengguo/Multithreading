package multithreading.chapter2.test1.t4;

public class MyThreadA extends Thread{

	private MyObject object ;
	
	public MyThreadA(MyObject obj) {
		super();
		object = obj;
	}
	public void run() {
		super.run();
		object.methodA();
	}
}
