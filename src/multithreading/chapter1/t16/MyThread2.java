package multithreading.chapter1.t16;

public class MyThread2 extends Thread{
	private long i=0; 
	public void run() {
		while (true)
		{
			i++;
			System.out.println(i);
			/**
			 *  ����� i ʱ main �����е�end �������
			 *  ���iʱ main�����е�end �����
			 *  ���������������ԭ����  ���������е� println() �����ڲ�ֹͣʱ ͬ����δ���ͷ�
			 *  ����println Դ�룺
			 *  public void println(long x){
			 *  	synchronized (this){
			 *  		print(x);
			 *  		newLine();
			 *  	}
			 *  }
			 *  �⵼�µ�ǰPrintStream ����� println ����һֱ��  ����ͣ��״̬������δ�ͷ� ����main�����е�  
			 *  System.out.println("end");  ��ִ��
			 */
		}
	}
}
