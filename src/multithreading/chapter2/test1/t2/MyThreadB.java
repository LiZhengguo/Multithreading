package multithreading.chapter2.test1.t2;

public class MyThreadB extends Thread{
	private HasSelfPrivateNum numRef;
	
	public MyThreadB(HasSelfPrivateNum numRef) {
		super();
		this.numRef = numRef;
	}
	
	public void run() {
		this.numRef.addI("b");
	}
}
