package multithreading.chapter1.t21;

public class run {
	
	/**
	 *Java �߳����������̣߳�һ���� �û��̣߳�һ�����ػ��߳�
	 *�������в����ڷ��ػ��߳��ˣ��ػ��߳��Զ����� 
	 */
	public static void main(String[] args) {
		try {
			MyThread t1 = new MyThread();
//			t1.setDaemon(true);  //����Ϊ�ػ��߳�  ����Ϊ���ػ��߳� t1 ��һֱִ�У�����Ϊ�ػ��߳� ���ػ��߳� main ִ����ɺ� t1 ���Զ�����
			t1.start();
			Thread.sleep(5000);
			System.out.println("���뿪��thread ����Ҳ���ٴ�ӡ�ˣ�Ҳ��ֹͣ��");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
