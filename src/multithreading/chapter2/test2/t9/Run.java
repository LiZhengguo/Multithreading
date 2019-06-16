package multithreading.chapter2.test2.t9;

public class Run {

	/**
	 * synchronized 关键字加到static 静态 方法上是给 class类上锁，而 synchronized 关键字加到非static静态方法上是给对象上锁
	 * 
	 * C 异步的原因是一个是对象锁，一个是class锁
	 * class 锁可以对类的所有对象实例起作用
	 * 
	 * A 和 B  是同步代码
	 * synchronized (Service.class) 和 synchronized static  是一样 的
	 * 所以
	 *  A B  D  是依次进入离开，进入离开，进入离开的  是同步的 
	 * 
	 */
	
	public static void main(String[] args) {
		Service service = new Service();
		Service service1 = new Service();
		ThreadA ta = new ThreadA(service);
		ThreadB tb = new ThreadB(service1);
		ThreadC tc = new ThreadC(service);
		ThreadD td = new ThreadD(service);
		
		ta.setName("A");
		tb.setName("B");
		tc.setName("C");
		td.setName("D");
		
		ta.start();
		tb.start();
		tc.start();
		td.start();
		
	}
}
