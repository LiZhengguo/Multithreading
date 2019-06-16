package multithreading.chapter2.test2.t7;

public class MyThreadA2 extends Thread{

	private ServiceA  sa;
	private MyObject obj;
	
	public MyThreadA2(ServiceA sa,MyObject obj) {
		this.sa = sa;
		this.obj = obj;
	}
	
	public void run() {
		sa.testMethodA(obj);
	}
}
