package multithreading.chapter1.t16;


/**
 * suspend 与  resume 方法的缺点   ----  独占
 */
public class run2 {
	/**
	 * suspend  暂停线程
	 * resume	恢复线程
	 */
	
	public static void main(String[] args) {
		try {
			MyThread2 t2 = new MyThread2();
			t2.start();
			Thread.sleep(1000);
			t2.suspend();
			System.out.println("end");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
