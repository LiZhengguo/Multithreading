package multithreading.chapter1.t12;

public class run {
	//能停止的线程  异常法
	public static void main(String[] args)  {
		try {
			MyThread t1 = new MyThread();
			t1.start();
			Thread.sleep(300);
			t1.interrupt();
			System.out.println("是否停止1："+t1.interrupted());//输出线程是否停止
			System.out.println("是否停止2："+t1.interrupted());//输出线程是否停止
			//interrupted()  测试当前线程是否已经中断   这个当前线程是指  main 它从未中断所以打印结果是两个false
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
	} 
}
