package multithreading.chapter1.t19;

public class run {
	/**
	 * 线程的优先级具有一定的规则性，CPU会尽量将执行资源让给优先级比较高的线程
	 * 优先级高的线程总是大部分先执行完成，但不代表优先级高的线程全部先执行完成
	 * 当优先级的等级差距很大时，谁先执行完和代码调用顺序无关 
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			MyThread1 t1 = new MyThread1();
			t1.setPriority(5);
			t1.start();
			MyThread2 t2 = new MyThread2();
			t2.setPriority(6);
			t2.start();
		}
	}
	/**
	 * 线程的优先级具有随机性
	 * 优先级高的线程不一定没有都先执行完成
	 * 线程优先级高的不一定每一次都先执行玩run() 方法中的任务
	 */
}
