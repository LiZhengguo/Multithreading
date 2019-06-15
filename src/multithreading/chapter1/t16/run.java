package multithreading.chapter1.t16;


/**
 * suspend ��  resume ������ȱ��   ----  ��ռ
 */
public class run {
	/**
	 * suspend  ��ͣ�߳�
	 * resume	�ָ��߳�
	 */
	
	public static void main(String[] args) {
		try {
			final SynchronizedObject object = new SynchronizedObject();
			 Thread t1 = new Thread(){
				 public void run() {
					 object.printString();
				 }
			 };
			 t1.setName("A");
			 t1.start();
			 Thread.sleep(1000);
			 Thread t2 = new Thread(){
				 public void run() {
					 System.out.println("�߳�2�������ǽ��벻��pringString()������");
					 System.out.println("��ΪpringString�������߳�A ������������ͣ��");
					 object.printString();
				 }
			 };
			 t2.setName("B");
			 t2.start();
			 Thread.sleep(2000);
			 t1.resume();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
