package multithreading.chapter1.t18;

public class run {
	/**
	 * �߳����ȼ��ļ̳���
	 * ��Java���̵߳����ȼ����м̳��ԣ�����A�߳�������B�߳� ��B�̵߳����ȼ� ��A�߳�һ��
	 */
	public static void main(String[] args) {
		System.out.println("main thread begin priority = "+Thread.currentThread().getPriority());
//		Thread.currentThread().setPriority(6); //���ȼ������ĺ��ڼ����̳�
		System.out.println("main thread end priority = "+Thread.currentThread().getPriority());
		MyThread1 t1 = new MyThread1();
		t1.start();
	}
}
