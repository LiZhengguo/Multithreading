package multithreading.chapter1.t7;

public class MyThread extends Thread{
	private int i = 5;  
	public void run (){
//		System.out.println("i="+(i--) +"  ”… "+Thread.currentThread().getName()+" º∆À„  ");
		System.out.println("i="+(i--)+"   threadName="+Thread.currentThread().getName());
	} 
}
