package multithreading.chapter1.t20;

public class run {
	/**
	 * 优先级高的线程运行速度快
	 */
	
	public static void main(String[] args) {
		try {
			MyThreadA ta = new MyThreadA();
			MyThreadB tb = new MyThreadB();
			
			ta.setPriority(Thread.NORM_PRIORITY -3);
			tb.setPriority(Thread.NORM_PRIORITY +3);
			
			ta.start();
			tb.start();
			
			Thread.sleep(20000);
			
			ta.stop();
			tb.stop();
			
			System.out.println("A = " + ta.getCount());
			System.out.println("B = " + tb.getCount());
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
