package multithreading.chapter1.t3;

/**
 * 
 * ClassName: run
 * @Description: 功能描述: 实现Runnable 接口
 * @author 
 * company:北京斯坦德科技发展有限公司
 * @date 2019年6月13日下午1:18:51
 */
public class run{
	public static void main(String[] args) {
		try {
			Runnable runnable = new MyRunnable();
			Thread thread = new Thread(runnable);
			thread.start();
			System.out.println("运行结束......");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
