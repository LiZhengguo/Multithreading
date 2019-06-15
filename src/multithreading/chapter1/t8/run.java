package multithreading.chapter1.t8;

/**
 * 
 * ClassName: run
 * @Description: 功能描述:currentThread()方法 可返回代码正在被那个线程调用的信息
 * @author 
 * company:北京斯坦德科技发展有限公司
 * @date 2019年6月13日下午2:50:48
 */
public class run {

	public static void main(String[] args) {
		MyThread mythread = new MyThread();
//		mythread.start();
		mythread.run();
		
		
		CountOperate c = new CountOperate();
		Thread t1 = new Thread(c);
		t1.setName("A");
		t1.start();
	}

}
