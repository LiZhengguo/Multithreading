package multithreading.chapter2.test2.t3;

public class Run {
	/**
	 * 
	 * 当一个线程访问object 的一个 synchronized 同步代码块时 另一个线程仍然可以访问object对象中的非synchronized(this)
	 * 同步代码块
	 * 
	 * 不在 synchronized块中的代码是异步执行的，在synchronized块中的是同步执行的
	 * 
	 */

	public static void main(String[] args) {
		
		Task task = new Task();
		
		MyThreadA ta = new MyThreadA(task);
		MyThreadB tb = new MyThreadB(task);
		
		ta.setName("A");
		tb.setName("B");
		ta.start();
		tb.start();
	}
}
