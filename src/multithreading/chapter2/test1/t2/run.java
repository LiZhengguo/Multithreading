package multithreading.chapter2.test1.t2;

public class run {

	/**
	 * 多个线程访问1个对象中的实例变量，则有可能出现“非线程安全”问题
	 * 
	 * 两个线程访问同一个对象中的同步方法时一定是线程安全的
	 * 
	 */
	public static void main(String[] args) {
		HasSelfPrivateNum numRef = new HasSelfPrivateNum();
		MyThreadA ta = new MyThreadA(numRef);
		MyThreadB tb = new MyThreadB(numRef);
		
		ta.start();
		tb.start();
		
	}
}
