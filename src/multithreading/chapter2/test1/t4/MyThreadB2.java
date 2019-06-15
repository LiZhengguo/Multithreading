package multithreading.chapter2.test1.t4;

public class MyThreadB2 extends Thread{

	private MyObject object ;
	
	public MyThreadB2(MyObject obj) {
		super();
		object = obj;
	}
	public void run() {
		super.run();
		object.methodB();
	}
}
