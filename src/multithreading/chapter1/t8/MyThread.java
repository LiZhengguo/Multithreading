package multithreading.chapter1.t8;

public class MyThread extends Thread{
	public MyThread(){
		System.out.println("构造方法打印："+Thread.currentThread().getName());
	}
	public void run(){
		System.out.println("run方法打印："+Thread.currentThread().getName());
	}
}
