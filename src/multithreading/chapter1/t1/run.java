package multithreading.chapter1.t1;

/**
 * 
 * ClassName: run
 * @Description: 功能描述: 线程调用的随机性            异步?
 * @author 
 * company:北京斯坦德科技发展有限公司
 * @date 2019年6月13日下午1:17:11
 */
public class run{
	public static void main(String[] args) {
		try { 
			MyThread myThread = new MyThread();
			myThread.setName("myThread");
			myThread.start();
			for (int i = 0; i < 10; i++) {
				int time = (int) (Math.random() * 1000);
				Thread.sleep(time);
				System.out.println("main="+Thread.currentThread().getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
