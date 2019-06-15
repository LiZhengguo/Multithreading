package multithreading.chapter1.t9;

public class MyThread extends Thread{
	public void run(){
		System.out.println("run = " + this.isAlive());
	}
}
