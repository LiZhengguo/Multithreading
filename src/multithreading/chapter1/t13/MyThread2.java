package multithreading.chapter1.t13;

public class MyThread2 extends Thread{
	
	public void run() {
		try {
			super.run(); 
			for (int i = 0; i < 10000; i++) {
				System.out.println("i = "+(i+1));
			}
			System.out.println("run begin");
			Thread.sleep(200000);
			System.out.println("run end");
		} catch (InterruptedException e) {
			System.out.println("ÏÈÍ£Ö¹£¬ÔÚ³ÁË¯ sleep "+this.isInterrupted());
			e.printStackTrace();
		}
	} 
}
