package multithreading.chapter1.t11;

public class MyThread extends Thread{
	
	public void run() {
		super.run();
		for(int i=0;i<50000;i++) {
			System.out.println("i=" + (i+1));
		}
	} 
}
