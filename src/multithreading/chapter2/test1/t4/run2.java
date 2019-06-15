package multithreading.chapter2.test1.t4;

public class run2 {
	/**
	 * ��֤ synchronized���� ������
	 * 
	 * ����synchronized�����ķ���һ�����Ŷ����е�
	 * 
	 * 1)A �߳��ȳ���object �����Lock����B�߳̿��� ���첽���ķ�������object�����еķ� synchronized ���͵ķ���
	 * 
	 * 2)A �߳��ȳ���object �����Lock����B�߳��������ʱ����object�����е�synchronized���͵ķ�������Ҫ�ȴ���Ҳ����ͬ��
	 * 
	 */
	
	public static void main(String[] args) {
		MyObject object = new MyObject();
		MyThreadA2 ta =new MyThreadA2(object);
		ta.setName("A");
		MyThreadB2 tb = new MyThreadB2(object);
		tb.setName("B");
		
		ta.start();
		tb.start(); 
	}
}
