package multithreading.chapter2.test1.t8;

public class run {
	/**
	 * synchronized �ؼ���  ���ܼ̳�
	 * ͬ�����ܼ̳У���Ҫ�������еķ������ synchronized �ؼ���
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
