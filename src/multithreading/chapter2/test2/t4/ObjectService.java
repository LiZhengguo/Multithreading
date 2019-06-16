package multithreading.chapter2.test2.t4;

public class ObjectService {

	public void serviceMethodA() {
		try {
			synchronized(this) {
				System.out.println("A begin time = " + System.currentTimeMillis());
				Thread.sleep(2000);
				System.out.println("A end   time = " + System.currentTimeMillis());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void serviceMethodB() {	
		try {
			synchronized(this) {
				System.out.println("B begin time = " + System.currentTimeMillis());
				Thread.sleep(2000);
				System.out.println("B end   time = " + System.currentTimeMillis());
			}		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	synchronized public void serviceMethodC() {	
		try {		
			System.out.println("C begin time = " + System.currentTimeMillis());
			Thread.sleep(2000);
			System.out.println("C end   time = " + System.currentTimeMillis());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
