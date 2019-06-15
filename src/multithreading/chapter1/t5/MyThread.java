package multithreading.chapter1.t5;

public class MyThread extends Thread{
	private int count = 5; 

	public void run (){
		super.run(); 
		count--;
		System.out.println("由 "+this.currentThread().getName()+" 计算  count= "+count);
	}
	/**
	 * 通过在run方法前加入 synchronized 关键字使多个线程在执行run方法时以排队的方式进行处理，
	 * 当一个线程调用run前，先判断run方法有没有被上锁，如果上锁说明其他线程正在调用run方法，必须
	 * 等其他线程对run方法调用结束后才可以执行run方法
	 */
//	synchronized public void run (){
//		super.run(); 
//		count--;
//		System.out.println("由 "+this.currentThread().getName()+" 计算  count= "+count);
//	}
}
