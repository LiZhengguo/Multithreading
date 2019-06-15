package multithreading.chapter1.t16;


/**
 * suspend 与  resume 方法的缺点   ----  独占
 */
public class run {
	/**
	 * suspend  暂停线程
	 * resume	恢复线程
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
					 System.out.println("线程2启动但是进入不了pringString()方法！");
					 System.out.println("因为pringString方法被线程A 锁定并永久暂停了");
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
