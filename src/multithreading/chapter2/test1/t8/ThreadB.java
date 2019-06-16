package multithreading.chapter2.test1.t8;

public class ThreadB extends Thread{
	
	private Sub sub;
	
	public ThreadB (Sub sub) {
		this.sub =sub;
	}
	
	public void run() {
		sub.subMethod();
	}
}
