package multithreading.chapter1.t17;

/**
 *  yield() 方法
 *  作用是放弃当前的CPU资源，将他让给其他任务去占用CPU执行的时间，但是放弃时间不确定，有可能刚刚放弃，马上又得到CPU时间片
 *
 */ 
public class run { 
	public static void main(String[] args) {
		try {
			MyThread t1 = new MyThread();
			t1.start();
			Thread.sleep(5000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
