package multithreading.chapter2.test2.t7;

public class RunA {
	/**
	 * ������߳�ͬ��ִ�� synchronized(X){} ͬ�������ͬ��Ч��
	 * x  ��ͬһ�����������
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
