package multithreading.chapter2.test2.t3;

public class Run {
	/**
	 * 
	 * ��һ���̷߳���object ��һ�� synchronized ͬ�������ʱ ��һ���߳���Ȼ���Է���object�����еķ�synchronized(this)
	 * ͬ�������
	 * 
	 * ���� synchronized���еĴ������첽ִ�еģ���synchronized���е���ͬ��ִ�е�
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
