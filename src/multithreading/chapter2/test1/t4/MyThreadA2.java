package multithreading.chapter2.test1.t4;

public class MyThreadA2 extends Thread{

	private MyObject object ;
	
	public MyThreadA2(MyObject obj) {
		super();
		object = obj;
	}
	public void run() {
		super.run();
		object.methodA();
	}
}
