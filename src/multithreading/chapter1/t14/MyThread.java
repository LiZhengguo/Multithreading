package multithreading.chapter1.t14;

public class MyThread extends Thread{

	private SynchronizedObject object;
	public MyThread(SynchronizedObject obj) {
		super();
		this.object = obj;
	}
	public void run() { 
		 object.printString("b", "bb"); 
	} 
}
