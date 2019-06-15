package multithreading.chapter1.t9;

/**
 * 在线程不作为参数传入另一个线程时，this和Thread.currentThread()【表面上】代表的是同一个对象。而当线程作为参数传入时，
 * this指向当前对象，即内部线程，而Thread.currentThread()指向当前方法被哪个线程调用的那个对象，即外部线程。
 * https://www.cnblogs.com/cing/p/8950716.html
 * 
 * ClassName: CountOperate
 * @Description: 功能描述:
 * @author 
 * company:北京斯坦德科技发展有限公司
 * @date 2019年6月13日下午3:15:08
 */
public class CountOperate extends Thread{

	public CountOperate(){
		System.out.println("CountOperate----begin");
		System.out.println("Thread.currentThread().getName() =="+Thread.currentThread().getName());
		System.out.println("Thread.currentThread().isAlive() =="+Thread.currentThread().isAlive());
		System.out.println("this.getName() =="+this.getName());
		System.out.println("this.isAlive() =="+this.isAlive());
		System.out.println("CountOperate----end");
	}
	public void run(){
		System.out.println("run----begin");
		System.out.println("Thread.currentThread().getName() =="+Thread.currentThread().getName());
		System.out.println("Thread.currentThread().isAlive() =="+Thread.currentThread().isAlive());
		System.out.println("this.getName() =="+this.getName());
		System.out.println("this.isAlive() =="+this.isAlive());
		System.out.println("run----end");
	}
}
