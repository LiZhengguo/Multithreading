package multithreading.chapter1.t21;

public class run {
	
	/**
	 *Java 线程中油两种线程，一种是 用户线程，一种是守护线程
	 *当进程中不存在非守护线程了，守护线程自动销毁 
	 */
	public static void main(String[] args) {
		try {
			MyThread t1 = new MyThread();
//			t1.setDaemon(true);  //设置为守护线程  设置为非守护线程 t1 会一直执行，设置为守护线程 非守护线程 main 执行完成后 t1 会自动销毁
			t1.start();
			Thread.sleep(5000);
			System.out.println("我离开了thread 对象也不再打印了，也就停止了");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
