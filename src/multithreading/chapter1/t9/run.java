package multithreading.chapter1.t9;

/**
 * 
 * ClassName: run
 * @Description: 功能描述: isAlive() 方法判断当前线程是否处于活动状态
 * @author 
 * company:北京斯坦德科技发展有限公司
 * @date 2019年6月13日下午2:58:42
 */
public class run {

	public static void main(String[] args) throws InterruptedException {
		MyThread mythread = new MyThread();
		System.out.println("begin == " +mythread.isAlive());
		mythread.start();
		Thread.sleep(1000);
		System.out.println("end == " +mythread.isAlive());
	}

}
