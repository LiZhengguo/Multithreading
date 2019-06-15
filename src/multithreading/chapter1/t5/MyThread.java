package multithreading.chapter1.t5;

public class MyThread extends Thread{
	private int count = 5; 

	public void run (){
		super.run(); 
		count--;
		System.out.println("�� "+this.currentThread().getName()+" ����  count= "+count);
	}
	/**
	 * ͨ����run����ǰ���� synchronized �ؼ���ʹ����߳���ִ��run����ʱ���Ŷӵķ�ʽ���д���
	 * ��һ���̵߳���runǰ�����ж�run������û�б��������������˵�������߳����ڵ���run����������
	 * �������̶߳�run�������ý�����ſ���ִ��run����
	 */
//	synchronized public void run (){
//		super.run(); 
//		count--;
//		System.out.println("�� "+this.currentThread().getName()+" ����  count= "+count);
//	}
}
