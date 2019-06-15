package multithreading.chapter1.t16;


/**
 * suspend ��  resume ������ȱ��   ----  ��ռ
 */
public class run3 {
	/**
	 * suspend  ��ͣ�߳�
	 * resume	�ָ��߳�
	 */
	
	public static void main(String[] args) {
		try {
			 final MyObject  obj = new MyObject();
			 Thread t1 = new Thread() {
				 public void run() {
					 obj.setValue("AA", "BBB");
				 }
			 };
			 t1.setName("A");
			 t1.start();
			 Thread.sleep(2000);
			 
			 Thread t2 = new Thread() {
				 public void run() {
					 obj.printlnValue();
				 }
			 };
			 t2.setName("A");
			 t2.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
