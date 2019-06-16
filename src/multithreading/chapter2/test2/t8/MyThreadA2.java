package multithreading.chapter2.test2.t8;

public class MyThreadA2 extends Thread{

	private MyObject obj;
	
	public MyThreadA2(MyObject obj) {
		this.obj = obj;
	}
	
	public void run() {
		obj.speedPringString();
	}
}
