package multithreading.chapter2.test2.t8;

public class RunA {
	/**
	 *  synchronized(x){}
	  *  �������߳�ִ�� x �����е�  synchronized ͬ�������ǳ�ͬ��Ч��
	 *  
	  *  �������߳�ִ�� X �����е�  synchronized(this) �����Ҳ����ͬ��Ч��
         *   ��������̵߳��ò��� synchronized �ؼ��ֵķ���ʱ�������첽����  
	 *  
	 */
	public static void main(String[] args) {
		ServiceA sa = new ServiceA();
		MyObject obj = new MyObject();
		
		MyThreadA1 a1 = new MyThreadA1(sa, obj);
		MyThreadA2 a2 = new MyThreadA2( obj);
		
		a1.setName("A");
		a2.setName("B");
		
		a1.start();
		a2.start();
		
	}
}
