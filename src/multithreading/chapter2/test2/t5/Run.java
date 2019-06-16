package multithreading.chapter2.test2.t5;

public class Run {

	/**
	 * 锁非this对象具有一定的优点：如果在一个类中有很多个synchronized 方法 ，这时虽然能够实现同步，但会受到阻塞所以影响运行效率
	 * 但如果使用同步代码块锁非this对象，则synchronized(非this)代码块中的程序与同步方法是异步的，不与其他锁this同步方法争抢this锁
	 * 可提高运行效率
	 * 使用synchronized(非this对象x)同步代码块，对象监视器必须是同一个对象，如果不是同一个对象监视器，运行的结果就是异步调用了，就会交叉运行
	 * 
	 * 对象监视器不同，运行结果是异步的
	 */
	public static void main(String[] args) {
		Service service = new Service();
		
		MyThreadA ta = new MyThreadA(service);
		MyThreadB tb = new MyThreadB(service);
		
		ta.setName("A");
		tb.setName("B");
		
		ta.start();
		tb.start();
		
	}
}
