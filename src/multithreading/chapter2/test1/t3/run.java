package multithreading.chapter2.test1.t3;

public class run {

	/**
	 *�����������
	 *�ؼ��� synchronized ȡ�õ��� �Ƕ�������������һ�δ���򷽷��������������������Ǹ��߳���ִ�д�synchronized�ؼ��ֵķ���
	 *�ĸ��߳̾ͳ��и÷��������������Lock����ô�����߳�ֻ�ܳʵȴ�״̬��ǰ���Ƕ���̷߳��ʵ���ͬһ������
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
