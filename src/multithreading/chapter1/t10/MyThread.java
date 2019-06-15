package multithreading.chapter1.t10;

public class MyThread extends Thread{
	public void run(){
		try {
			System.out.println("run threadName = " +this.currentThread().getName() + " begin " + System.currentTimeMillis());
			Thread.sleep(2000);
			System.out.println("run threadName = " +this.currentThread().getName() + " end " + System.currentTimeMillis());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
