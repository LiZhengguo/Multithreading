package multithreading.chapter1.t13;

public class MyThread4 extends Thread{
	private int i=0;
	
	public void run() {
		try {
			super.run(); 
			this.stop();
		} catch (ThreadDeath e) { 
			System.out.println("MyThread4 catch");
			e.printStackTrace();
		}
	} 
}
