package multithreading.chapter1.t10;

public class run2 {
	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		t1.interrupt();
		System.out.println("�߳�ID��"+t1.getId());
	}
}
