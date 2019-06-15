package multithreading.chapter1.t13;

public class MyThread3 extends Thread{
	private int i=0;
	
	public void run() {
		try {
			super.run(); 
			while(true){
				i++;
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) { 
			System.err.println("MyObject catch");
			e.printStackTrace();
		}
	} 
}
