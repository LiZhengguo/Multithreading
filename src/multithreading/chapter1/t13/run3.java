package multithreading.chapter1.t13;

public class run3 {
	//能停止的线程  ---- 暴力停止
	public static void main(String[] args)  {
		try {
			MyThread3 t1 = new MyThread3();
			t1.start(); 
			Thread.sleep(8000);
			t1.stop(); 
			Thread.currentThread().stop();
		} catch (ThreadDeath e) { 
			System.out.println("main catch");
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
	} 
}
