package multithreading.chapter1.t13;

public class MyThread extends Thread{
	
	public void run() {
		try {
			super.run(); 
			System.out.println("run begin");
			Thread.sleep(200000);
			System.out.println("run end");
		} catch (InterruptedException e) {
			System.out.println("在沉睡中停止，进入MyThread.java类run方法中的catch了！！"+this.isInterrupted());
			e.printStackTrace();
		}
	} 
}
