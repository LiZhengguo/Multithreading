package multithreading.chapter1.t19;

public class run {
	/**
	 * �̵߳����ȼ�����һ���Ĺ����ԣ�CPU�ᾡ����ִ����Դ�ø����ȼ��Ƚϸߵ��߳�
	 * ���ȼ��ߵ��߳����Ǵ󲿷���ִ����ɣ������������ȼ��ߵ��߳�ȫ����ִ�����
	 * �����ȼ��ĵȼ����ܴ�ʱ��˭��ִ����ʹ������˳���޹� 
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			MyThread1 t1 = new MyThread1();
			t1.setPriority(5);
			t1.start();
			MyThread2 t2 = new MyThread2();
			t2.setPriority(6);
			t2.start();
		}
	}
	/**
	 * �̵߳����ȼ����������
	 * ���ȼ��ߵ��̲߳�һ��û�ж���ִ�����
	 * �߳����ȼ��ߵĲ�һ��ÿһ�ζ���ִ����run() �����е�����
	 */
}
