package multithreading.chapter2.test1.t1;

public class run {

	/**
	 * 方法中的变量不存在 非线程安全问题，永远都是线程安全的这是方法内部的变量是私有的特性造成的
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
