package multithreading.chapter2.test1.t6;

public class run {
	/**
	 * 可重入锁 ： 自己可以再次获取自己的内部锁。比如：一条线程获得了某个对象的锁，此时这个对象锁还没有释放，当其再次想要获取这个对象的锁时还是
	 * 可以获取的，如果不可以重入锁的话，会造成死锁
	 * 
	 */
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();
	}
}
