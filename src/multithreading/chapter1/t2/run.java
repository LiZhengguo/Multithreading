package multithreading.chapter1.t2;

/**
 * 
 * ClassName: run
 * @Description: 功能描述:线程启动顺序与 start()执行顺序无关
 * @author 
 * company:北京斯坦德科技发展有限公司
 * @date 2019年6月13日下午1:18:51
 */
public class run{
	public static void main(String[] args) {
		try { 
			MyThread t1 = new MyThread(1); 
			MyThread t2 = new MyThread(2);
			MyThread t3 = new MyThread(3);
			MyThread t4 = new MyThread(4);
			MyThread t5 = new MyThread(5);
			MyThread t6 = new MyThread(6);
			MyThread t7 = new MyThread(7);
			MyThread t8 = new MyThread(8);
			MyThread t9 = new MyThread(9);
			MyThread t10 = new MyThread(10);
			
			t1.start();
			t2.start();
			t3.start();
			t4.start();
			t5.start();
			t6.start();
			t7.start();
			t8.start();
			t9.start();
			t10.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
