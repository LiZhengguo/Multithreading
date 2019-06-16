package multithreading.chapter2.test1.t8;

public class ThreadA extends Thread{
	
	private Sub sub;
	
	public ThreadA (Sub sub) {
		this.sub =sub;
	}
	
	public void run() {
		sub.subMethod();
	}
}
