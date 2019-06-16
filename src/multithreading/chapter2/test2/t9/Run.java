package multithreading.chapter2.test2.t9;

public class Run {

	/**
	 * synchronized �ؼ��ּӵ�static ��̬ �������Ǹ� class���������� synchronized �ؼ��ּӵ���static��̬�������Ǹ���������
	 * 
	 * C �첽��ԭ����һ���Ƕ�������һ����class��
	 * class �����Զ�������ж���ʵ��������
	 * 
	 * A �� B  ��ͬ������
	 * synchronized (Service.class) �� synchronized static  ��һ�� ��
	 * ����
	 *  A B  D  �����ν����뿪�������뿪�������뿪��  ��ͬ���� 
	 * 
	 */
	
	public static void main(String[] args) {
		Service service = new Service();
		Service service1 = new Service();
		ThreadA ta = new ThreadA(service);
		ThreadB tb = new ThreadB(service1);
		ThreadC tc = new ThreadC(service);
		ThreadD td = new ThreadD(service);
		
		ta.setName("A");
		tb.setName("B");
		tc.setName("C");
		td.setName("D");
		
		ta.start();
		tb.start();
		tc.start();
		td.start();
		
	}
}
