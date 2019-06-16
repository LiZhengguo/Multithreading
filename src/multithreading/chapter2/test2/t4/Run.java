package multithreading.chapter2.test2.t4;

public class Run {

	/**
	 * 
	 * 在使用同步 synchronized(this) 代码块时需要注意的是，当一个线程访问object的一个synchronized(this)同步代码块时，其他线程对同一个object中所有
	 * 其他synchonized(this)同步代码块的访问将被阻塞，这说明synchronzied使用的“对象监视器” 是一个
	 * 
	 * 和 synchronized 一样  synchronized(this) 代码块也是锁定当前对象
	 */
	public static void main(String[] args) {
		ObjectService obj = new ObjectService();
		MyThreadA ta = new MyThreadA(obj);
		MyThreadB tb = new MyThreadB(obj);
		MyThreadC tc = new MyThreadC(obj);
		
		ta.setName("A");
		tb.setName("B");
		tc.setName("C");
		
		ta.start();
		tb.start();
		tc.start();
		
	}
}
