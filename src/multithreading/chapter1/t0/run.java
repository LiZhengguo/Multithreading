package multithreading.chapter1.t0;

/**
 * 
 * ClassName: run
 * @Description: 功能描述:代码运行结果与代码执行顺序或调用顺序无关
 * @author 
 * company:北京斯坦德科技发展有限公司
 * @date 2019年6月13日下午1:14:16
 */
public class run{
	
	public static void main(String[] args) {
		try {
			MyThread myThread = new MyThread();
			myThread.start();
			System.out.println("运行结束！"); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
