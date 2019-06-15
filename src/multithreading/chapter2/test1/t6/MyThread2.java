package multithreading.chapter2.test1.t6;

public class MyThread2 extends Thread{
	
	public void run() {
		Sub sub = new Sub();
		sub.operateISubMethod();
	}
}
