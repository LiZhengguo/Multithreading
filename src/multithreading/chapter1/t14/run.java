package multithreading.chapter1.t14;

public class run {
	public static void main(String[] args) {
		try {
			SynchronizedObject obj = new SynchronizedObject();
			MyThread t1 = new MyThread(obj);
			t1.start();
			Thread.sleep(500);
			t1.stop();
			System.out.println(obj.getUserName()+"    "+obj.getPassword());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
