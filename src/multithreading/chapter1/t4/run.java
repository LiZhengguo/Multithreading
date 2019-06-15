package multithreading.chapter1.t4;

/**
 * 
 * ClassName: run
 * @Description: 功能描述:实例变量与线程安全  
 * @author 
 * company:北京斯坦德科技发展有限公司
 * @date 2019年6月13日下午1:14:16
 */
public class run{
	/**
	 *  1：不共享数据
	 */
	public static void main(String[] args) {
		try {
			MyThread myThreadA = new MyThread("A");
			MyThread myThreadB = new MyThread("B");
			MyThread myThreadC = new MyThread("C");
			myThreadA.start();
			myThreadB.start();
			myThreadC.start(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	} 
}
