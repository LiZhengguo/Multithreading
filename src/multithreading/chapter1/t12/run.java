package multithreading.chapter1.t12;

public class run {
	//��ֹͣ���߳�  �쳣��
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
