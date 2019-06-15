package multithreading.chapter1.t16;

public class MyThread2 extends Thread{
	private long i=0; 
	public void run() {
		while (true)
		{
			i++;
			System.out.println(i);
			/**
			 *  不输出 i 时 main 方法中的end 可以输出
			 *  输出i时 main方法中的end 不输出
			 *  出现这样的情况的原因是  当程序运行到 println() 方法内部停止时 同步锁未被释放
			 *  方法println 源码：
			 *  public void println(long x){
			 *  	synchronized (this){
			 *  		print(x);
			 *  		newLine();
			 *  	}
			 *  }
			 *  这导致当前PrintStream 对象的 println 方法一直呈  “暂停”状态并且锁未释放 所以main方法中的  
			 *  System.out.println("end");  不执行
			 */
		}
	}
}
