package multithreading.chapter2.test2.t8;

public class MyThreadA1 extends Thread{

	private ServiceA  sa;
	private MyObject obj;
	
	public MyThreadA1(ServiceA sa,MyObject obj) {
		this.sa = sa;
		this.obj = obj;
	}
	
	public void run() {
		sa.testMethodA(obj);
	}
}
