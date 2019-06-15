package multithreading.chapter1.t11;

public class run3 { 
	public static void main(String[] args)  {
		try {
			MyThread t1 = new MyThread();
			t1.start();
			Thread.sleep(340);
			t1.interrupt();
			System.out.println("是否停止1："+t1.isInterrupted());//输出线程是否停止
			System.out.println("是否停止2："+t1.isInterrupted());//输出线程是否停止
			/**
			 * this.interrupted():测试当前线程是否已经是中断状态，执行后具有将状态标志清除为false的功能
			 * this.isInterrupted():测试线程Thread对象是否已经是中断状态，但不清除状态标准
			 */
		} catch (Exception e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
