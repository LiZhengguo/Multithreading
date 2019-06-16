package multithreading.chapter2.test2.t7;

public class RunA {
	/**
	 * 当多个线程同步执行 synchronized(X){} 同步代码呈同步效果
	 * x  是同一个对象监视器
	 */
	public static void main(String[] args) {
		ServiceA sa = new ServiceA();
		MyObject obj = new MyObject();
		
		MyThreadA1 a1 = new MyThreadA1(sa, obj);
		MyThreadA2 a2 = new MyThreadA2(sa, obj);
		
		a1.setName("A");
		a2.setName("B");
		
		a1.start();
		a2.start();
		
	}
}
