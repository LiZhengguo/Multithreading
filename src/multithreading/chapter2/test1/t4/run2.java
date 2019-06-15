package multithreading.chapter2.test1.t4;

public class run2 {
	/**
	 * 验证 synchronized锁是 对象锁
	 * 
	 * 调用synchronized声明的方法一定是排队运行的
	 * 
	 * 1)A 线程先持有object 对象的Lock锁，B线程可以 以异步订的方法调用object对象中的非 synchronized 类型的方法
	 * 
	 * 2)A 线程先持有object 对象的Lock锁，B线程如果在这时调用object对象中的synchronized类型的方法则需要等待，也就是同步
	 * 
	 */
	
	public static void main(String[] args) {
		MyObject object = new MyObject();
		MyThreadA2 ta =new MyThreadA2(object);
		ta.setName("A");
		MyThreadB2 tb = new MyThreadB2(object);
		tb.setName("B");
		
		ta.start();
		tb.start(); 
	}
}
