package multithreading.chapter2.test1.t3;

public class MyThreadA extends Thread{
	private HasSelfPrivateNum numRef;
	
	public MyThreadA(HasSelfPrivateNum numRef) {
		super();
		this.numRef = numRef;
	}
	
	public void run() {
		this.numRef.addI("a");
	}
}
