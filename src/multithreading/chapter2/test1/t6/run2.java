package multithreading.chapter2.test1.t6;

public class run2 {
	/**
	 * 可重入锁 ： 自己可以再次获取自己的内部锁。比如：一条线程获得了某个对象的锁，此时这个对象锁还没有释放，当其再次想要获取这个对象的锁时还是
	 * 可以获取的，如果不可以重入锁的话，会造成死锁
	 * 
	 * 当处在父子类继承关系时，子类完全可以通过“可重入锁”调用父类的同步方法
	 */
	public static void main(String[] args) {
		MyThread2 t2 = new MyThread2();
		t2.start();
	}
}
