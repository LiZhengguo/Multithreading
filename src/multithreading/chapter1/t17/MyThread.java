package multithreading.chapter1.t17;

public class MyThread extends Thread{
	 
	public void run() {
		long beginTime = System.currentTimeMillis();
		int count =0;
		for (int i=0;i<500000;i++) {
			count =count+(i+1);
			Thread.yield();
		}
		long endTime = System.currentTimeMillis();
		
		System.out.println("程序执行完成，用时："+(endTime - beginTime)+"毫米");
	}
}
