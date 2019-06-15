package multithreading.chapter1.t16;

public class SynchronizedObject {
	synchronized public void printString() {
		System.out.println("Begin");
		if(Thread.currentThread().getName().equals("A")) {
			System.out.println("A �߳���Զ  suspend ��!");
			Thread.currentThread().suspend();
		}
		System.out.println("end");
	}
}
