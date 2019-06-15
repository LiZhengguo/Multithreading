package multithreading.chapter1.t11;

public class run2 { 
	public static void main(String[] args)  {
		try {
			Thread.currentThread().interrupt();
			System.out.println(Thread.currentThread().getName());
			System.out.println("是否停止1："+Thread.interrupted());
			System.out.println("是否停止2："+Thread.interrupted());
			System.out.println("end");
			/***
			 * interrupted() 方法的确可以判断当前线程是否是停止状态   但是第二个为啥是 false，
			 * 官方文档：
			 * 测试当前线程是否中断，线程的中断状态由该方法清除
			 * 连续调用两次该方法 第二次返回 false
			 * 在第一次调用已经清除了其中的中断状态之后，且第二次调用检验中断状态前当前线程再次中断的情况除外
			 * */
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
