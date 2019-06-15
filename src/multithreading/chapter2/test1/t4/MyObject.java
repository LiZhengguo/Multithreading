package multithreading.chapter2.test1.t4;

public class MyObject {
	
	synchronized public void methodA() {
		try {
			System.out.println("begin methodA threadName = " +Thread.currentThread().getName()+" beginTime "+System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("methodA end");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	synchronized public void methodB() {
		try {
			System.out.println("begin methodB threadName = " +Thread.currentThread().getName()+" beginTime "+System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("methodB end");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
