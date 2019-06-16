package multithreading.chapter2.test2.t3;

public class Task {

	public void doLongTimeTask() {
		for(int i=0;i<100;i++) {
			System.out.println("nosynchronized ThreadName = "+Thread.currentThread().getName()+" i = "+ i);
		}
		System.out.println("");
		synchronized(this) {
			for(int i=0;i<100;i++) {
				System.out.println("synchronized ThreadName = "+Thread.currentThread().getName()+" i = "+ i);
			}
		}
	}
}
