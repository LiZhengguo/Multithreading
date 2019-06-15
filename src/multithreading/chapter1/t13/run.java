package multithreading.chapter1.t13;

public class run {
	//在沉睡中停止
	//先沉睡再interr()
	public static void main(String[] args)  {
		try {
			MyThread t1 = new MyThread();
			t1.start();
			Thread.sleep(3000);
			t1.interrupt(); 
			
		} catch (Exception e) { 
			e.printStackTrace();
		}
		System.out.println("end");
	} 
}
