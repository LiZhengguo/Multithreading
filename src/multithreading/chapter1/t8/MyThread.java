package multithreading.chapter1.t8;

public class MyThread extends Thread{
	public MyThread(){
		System.out.println("���췽����ӡ��"+Thread.currentThread().getName());
	}
	public void run(){
		System.out.println("run������ӡ��"+Thread.currentThread().getName());
	}
}
