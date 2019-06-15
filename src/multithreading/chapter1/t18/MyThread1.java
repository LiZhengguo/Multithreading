package multithreading.chapter1.t18;

public class MyThread1 extends Thread{
	
	public void run() {
		System.out.println("MyThread1 run priority = " + this.getPriority());
		MyThread2 t2  = new MyThread2();
		t2.start();
	}
}
