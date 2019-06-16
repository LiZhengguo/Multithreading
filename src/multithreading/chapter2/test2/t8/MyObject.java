package multithreading.chapter2.test2.t8;

public class MyObject {

	synchronized public void speedPringString() {
		System.out.println("speedPringString ____getLock time = " + System.currentTimeMillis() + " run Thread Name = "+Thread.currentThread().getName());
		System.out.println("-------------------------");
		System.out.println("speedPringString releaseLock time = " + System.currentTimeMillis() + " run Thread Name = "+Thread.currentThread().getName());
		
	}
}
