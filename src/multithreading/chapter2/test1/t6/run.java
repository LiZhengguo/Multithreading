package multithreading.chapter2.test1.t6;

public class run {
	/**
	 * �������� �� �Լ������ٴλ�ȡ�Լ����ڲ��������磺һ���̻߳����ĳ�������������ʱ�����������û���ͷţ������ٴ���Ҫ��ȡ����������ʱ����
	 * ���Ի�ȡ�ģ�����������������Ļ������������
	 * 
	 */
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();
	}
}
