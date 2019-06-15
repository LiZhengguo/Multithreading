package multithreading.chapter1.t11;

public class run {
	//停止线程  Thread.stop()已经弃用  大多数停止线程的方法是  Thread.interrupt(),尽管方法名称是“停止，中止”但这个方法不会停止一个正在运行的一个线程，
	//需要加入一个判断才可以完成线程的停止
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
