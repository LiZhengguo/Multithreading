package multithreading.chapter1.t18;

public class run {
	/**
	 * 线程优先级的继承性
	 * 在Java中线程的优先级具有继承性，比如A线程启动了B线程 则B线程的优先级 与A线程一致
	 */
	public static void main(String[] args) {
		System.out.println("main thread begin priority = "+Thread.currentThread().getPriority());
//		Thread.currentThread().setPriority(6); //优先级被更改后在继续继承
		System.out.println("main thread end priority = "+Thread.currentThread().getPriority());
		MyThread1 t1 = new MyThread1();
		t1.start();
	}
}
