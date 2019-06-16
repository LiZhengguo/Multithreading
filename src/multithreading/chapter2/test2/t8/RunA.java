package multithreading.chapter2.test2.t8;

public class RunA {
	/**
	 *  synchronized(x){}
	  *  当其他线程执行 x 对象中的  synchronized 同步方法是呈同步效果
	 *  
	  *  当其他线程执行 X 对象中的  synchronized(this) 代码块也呈现同步效果
         *   如果其他线程调用不加 synchronized 关键字的方法时，还是异步调用  
	 *  
	 */
	public static void main(String[] args) {
		ServiceA sa = new ServiceA();
		MyObject obj = new MyObject();
		
		MyThreadA1 a1 = new MyThreadA1(sa, obj);
		MyThreadA2 a2 = new MyThreadA2( obj);
		
		a1.setName("A");
		a2.setName("B");
		
		a1.start();
		a2.start();
		
	}
}
