package multithreading.chapter1.t15;



public class run {
	/**
	 * suspend  暂停线程
	 * resume	恢复线程
	 */
	
	public static void main(String[] args) {
		try {
			MyThread t1 = new MyThread();
			t1.start();
			Thread.sleep(5000);
			t1.suspend();
			System.out.println("A = "+System.currentTimeMillis()+ " I =" + t1.getI());
			Thread.sleep(5000);
			System.out.println("A = "+System.currentTimeMillis()+ " I =" + t1.getI());
			t1.resume();
			System.out.println("B = "+System.currentTimeMillis()+ " I =" + t1.getI());
			Thread.sleep(5000);
			System.out.println("B = "+System.currentTimeMillis()+ " I =" + t1.getI());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
