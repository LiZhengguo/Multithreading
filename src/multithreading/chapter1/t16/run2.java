package multithreading.chapter1.t16;


/**
 * suspend ��  resume ������ȱ��   ----  ��ռ
 */
public class run2 {
	/**
	 * suspend  ��ͣ�߳�
	 * resume	�ָ��߳�
	 */
	
	public static void main(String[] args) {
		try {
			MyThread2 t2 = new MyThread2();
			t2.start();
			Thread.sleep(1000);
			t2.suspend();
			System.out.println("end");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
