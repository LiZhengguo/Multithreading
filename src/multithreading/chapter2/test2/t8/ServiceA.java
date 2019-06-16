package multithreading.chapter2.test2.t8;

public class ServiceA {
	
	public void testMethodA(MyObject object) {
		synchronized(object) {
			try {
				System.out.println("testMethodA ____getLock time = " + System.currentTimeMillis() + " run Thread Name = "+Thread.currentThread().getName());
				Thread.sleep(2000);
				System.out.println("testMethodA releaseLock time = " + System.currentTimeMillis() + " run Thread Name = "+Thread.currentThread().getName());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
