package multithreading.chapter2.test2.t5;

public class Run2 {

	/**
	 *从运行结果来看，同步块中的代码是同步打印的，当前线程执行与退出是成对出现的，但线程A和线程B的执行却是异步的，这就有可能出现脏读的环境
	 *由于线程执行方法的顺序不确定，所以当A和B两个线程执行带有分支判断的方法时，就会出现逻辑上的错误有可能出现脏读
	 */
	public static void main(String[] args) {
		MyList list = new MyList();
		MyThreadListA la = new MyThreadListA(list);
		MyThreadListB lb = new MyThreadListB(list);
		
		la.setName("A");
		lb.setName("B");
		
		la.start();
		lb.start();
		
	}
}
