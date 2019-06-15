package multithreading.chapter1.t12;

public class MyThread extends Thread{
	
	public void run() {
		try {
			super.run();
			for(int i=0;i<50000;i++) {
				if(this.interrupted()) {
					System.out.println("线程已经停止！！！");
//				break;
					throw new InterruptedException();
				}
				System.out.println("i=" + (i+1));
			}
			System.out.println("我在 for 下面，代码继续执行！！");
		} catch (InterruptedException e) {
			System.out.println("进入MyThread.java类run方法中的catch了！！");
			e.printStackTrace();
		}
	} 
}
