package multithreading.chapter1.t11;

public class run2 { 
	public static void main(String[] args)  {
		try {
			Thread.currentThread().interrupt();
			System.out.println(Thread.currentThread().getName());
			System.out.println("�Ƿ�ֹͣ1��"+Thread.interrupted());
			System.out.println("�Ƿ�ֹͣ2��"+Thread.interrupted());
			System.out.println("end");
			/***
			 * interrupted() ������ȷ�����жϵ�ǰ�߳��Ƿ���ֹͣ״̬   ���ǵڶ���Ϊɶ�� false��
			 * �ٷ��ĵ���
			 * ���Ե�ǰ�߳��Ƿ��жϣ��̵߳��ж�״̬�ɸ÷������
			 * �����������θ÷��� �ڶ��η��� false
			 * �ڵ�һ�ε����Ѿ���������е��ж�״̬֮���ҵڶ��ε��ü����ж�״̬ǰ��ǰ�߳��ٴ��жϵ��������
			 * */
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
