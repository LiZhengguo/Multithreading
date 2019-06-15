package multithreading.chapter2.test1.t4;

public class MyThreadB extends Thread{

	private MyObject object ;
	
	public MyThreadB(MyObject obj) {
		super();
		object = obj;
	}
	public void run() {
		super.run();
		object.methodA();
	}
}
