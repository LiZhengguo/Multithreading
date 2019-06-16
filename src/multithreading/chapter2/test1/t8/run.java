package multithreading.chapter2.test1.t8;

public class run {
	/**
	 * synchronized 关键字  不能继承
	 * 同步不能继承，需要在子类中的方法添加 synchronized 关键字
	 */

	public static void main(String[] args) {
		Sub sub = new Sub();
		ThreadA ta = new ThreadA(sub);
		ThreadB tb = new ThreadB(sub);
		
		ta.setName("A");
		tb.setName("B");
		
		ta.start();
		tb.start();
	}
}
