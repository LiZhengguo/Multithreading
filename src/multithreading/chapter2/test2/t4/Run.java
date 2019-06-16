package multithreading.chapter2.test2.t4;

public class Run {

	/**
	 * 
	 * ��ʹ��ͬ�� synchronized(this) �����ʱ��Ҫע����ǣ���һ���̷߳���object��һ��synchronized(this)ͬ�������ʱ�������̶߳�ͬһ��object������
	 * ����synchonized(this)ͬ�������ķ��ʽ�����������˵��synchronziedʹ�õġ������������ ��һ��
	 * 
	 * �� synchronized һ��  synchronized(this) �����Ҳ��������ǰ����
	 */
	public static void main(String[] args) {
		ObjectService obj = new ObjectService();
		MyThreadA ta = new MyThreadA(obj);
		MyThreadB tb = new MyThreadB(obj);
		MyThreadC tc = new MyThreadC(obj);
		
		ta.setName("A");
		tb.setName("B");
		tc.setName("C");
		
		ta.start();
		tb.start();
		tc.start();
		
	}
}
