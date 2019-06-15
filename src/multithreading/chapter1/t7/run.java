package multithreading.chapter1.t7;

/**
 * 
 * ClassName: run
 * @Description: 功能描述: i-- 与  System.out.println();  的异常
 * @author 
 * company:北京斯坦德科技发展有限公司
 * @date 2019年6月13日下午1:14:16
 */
public class run{
	/**
	 *  1：数据共享    非线程安全
	 */
	public static void main(String[] args) {
		try {
			
			MyThread myThread = new MyThread();
			Thread a = new Thread(myThread,"A");
			Thread b = new Thread(myThread,"B");
			Thread c = new Thread(myThread,"C");
			Thread d = new Thread(myThread,"D");
			Thread e = new Thread(myThread,"E");
			
			a.start();
			b.start();
			c.start();
			d.start();
			e.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	} 
}
