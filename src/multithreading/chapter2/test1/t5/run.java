package multithreading.chapter2.test1.t5;

public class run {

	/**
	 * 脏读
	 */
	public static void main(String[] args) {
		Publicvar var = new Publicvar();
		try {
			MyThreadA ta = new MyThreadA(var);
			ta.start();
			Thread.sleep(200);//打印结果受此值大小影响
			var.getValue();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 当 A 线程 调用 anyObject 对象加入 synchronized 关键字的 X方法时A线程就获得了X方法锁，跟准确地讲是获得了对象锁，所以其他线程必须等A线程执行完毕才可以
	 * 调用X方法，但B线程可以随意调用其他非synchronized 同步方法
	 * 当A线程调用anyObject对象加入synchronized 关键字的X方法时，A线程就获得了X方法所在的对象锁，所以其他线程必须等A线程执行完毕才可以调用X方法，而
	 * B线程如果调用了声明 了synchronized 关键字的非X方法时，必须等A线程将X方法执行完，也就是释放对象锁后才可以调用。
	 * 这时A线程已经执行完了一个完整的任务，也就是说username和password这两个实例变量已经同时赋值成功，不存在脏读的基本环境
	 */
}
