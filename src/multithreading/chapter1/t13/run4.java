package multithreading.chapter1.t13;

public class run4 {
	//stop �� java.lang.ThreadDeath �쳣
	//���� stop ����ʱ���׳�java.lang.ThreadDeath �쳣����ͨ������´��쳣����Ҫ��ʾ�ز�׽
	public static void main(String[] args)  {
		try {
			MyThread4 t1 = new MyThread4(); 
			t1.start();
		} catch (Exception e) { 
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end");
	} 
}
