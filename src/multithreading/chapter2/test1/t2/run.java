package multithreading.chapter2.test1.t2;

public class run {

	/**
	 * ����̷߳���1�������е�ʵ�����������п��ܳ��֡����̰߳�ȫ������
	 * 
	 * �����̷߳���ͬһ�������е�ͬ������ʱһ�����̰߳�ȫ��
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
