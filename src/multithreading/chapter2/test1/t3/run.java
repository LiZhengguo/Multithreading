package multithreading.chapter2.test1.t3;

public class run {

	/**
	 *多个对象多个锁
	 *关键字 synchronized 取得的锁 是对象锁，而不是一段代码或方法（函数）当锁，所以那个线程先执行带synchronized关键字的方法
	 *哪个线程就持有该方法所属对象的锁Lock，那么其他线程只能呈等待状态，前提是多个线程访问的是同一个对象
	 * 
	 */
	public static void main(String[] args) {
		HasSelfPrivateNum numRefA = new HasSelfPrivateNum();
		HasSelfPrivateNum numRefB = new HasSelfPrivateNum();
		MyThreadA ta = new MyThreadA(numRefA);
		MyThreadB tb = new MyThreadB(numRefB);
		
		ta.start();
		tb.start();
		
	}
}
