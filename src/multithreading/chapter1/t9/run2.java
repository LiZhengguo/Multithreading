package multithreading.chapter1.t9;

/**
 * 
 * ClassName: run
 * @Description: 功能描述: isAlive() 方法判断当前线程是否处于活动状态
 * @author 
 * company:北京斯坦德科技发展有限公司
 * @date 2019年6月13日下午2:58:42
 */
public class run2 {

	public static void main(String[] args) throws InterruptedException {
		CountOperate o = new  CountOperate();
		Thread t1 = new Thread(o);
		System.out.println("main begin t1 isAlive = "+t1.isAlive());
		t1.setName("A");
		t1.start();
		System.out.println("main end t1 isAlive = "+t1.isAlive());
	}

}
