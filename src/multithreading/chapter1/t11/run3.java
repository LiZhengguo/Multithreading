package multithreading.chapter1.t11;

public class run3 { 
	public static void main(String[] args)  {
		try {
			MyThread t1 = new MyThread();
			t1.start();
			Thread.sleep(340);
			t1.interrupt();
			System.out.println("�Ƿ�ֹͣ1��"+t1.isInterrupted());//����߳��Ƿ�ֹͣ
			System.out.println("�Ƿ�ֹͣ2��"+t1.isInterrupted());//����߳��Ƿ�ֹͣ
			/**
			 * this.interrupted():���Ե�ǰ�߳��Ƿ��Ѿ����ж�״̬��ִ�к���н�״̬��־���Ϊfalse�Ĺ���
			 * this.isInterrupted():�����߳�Thread�����Ƿ��Ѿ����ж�״̬���������״̬��׼
			 */
		} catch (Exception e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
