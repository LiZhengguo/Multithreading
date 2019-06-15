package multithreading.chapter1.t16;


/**
 * suspend 与  resume 方法的缺点   ----  独占
 */
public class run3 {
	/**
	 * suspend  暂停线程
	 * resume	恢复线程
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
