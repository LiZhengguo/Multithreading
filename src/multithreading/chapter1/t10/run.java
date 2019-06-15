package multithreading.chapter1.t10;

/**
 * 
 * ClassName: run
 * @Description: 功能描述: sleep() 在指定的毫秒数内让当前“正在执行的线程”休眠（暂停执行） 这个“正在执行的线程” 是
 * this this.currentThread()返回的线程
 * @author 
 * company:北京斯坦德科技发展有限公司
 * @date 2019年6月13日下午2:58:42
 */
public class run {

	public static void main(String[] args) throws InterruptedException {
		MyThread mythread = new MyThread();
		System.out.println("begin == " +System.currentTimeMillis());
		mythread.start(); 
		System.out.println("end == " +System.currentTimeMillis());
	}

}
