package multithreading.chapter1.t11;

public class run {
	//ֹͣ�߳�  Thread.stop()�Ѿ�����  �����ֹͣ�̵߳ķ�����  Thread.interrupt(),���ܷ��������ǡ�ֹͣ����ֹ���������������ֹͣһ���������е�һ���̣߳�
	//��Ҫ����һ���жϲſ�������̵߳�ֹͣ
	public static void main(String[] args)  {
		try {
			MyThread t1 = new MyThread();
			t1.start();
			Thread.sleep(300);
			t1.interrupt();
			System.out.println("�Ƿ�ֹͣ1��"+t1.interrupted());//����߳��Ƿ�ֹͣ
			System.out.println("�Ƿ�ֹͣ2��"+t1.interrupted());//����߳��Ƿ�ֹͣ
			//interrupted()  ���Ե�ǰ�߳��Ƿ��Ѿ��ж�   �����ǰ�߳���ָ  main ����δ�ж����Դ�ӡ���������false
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
