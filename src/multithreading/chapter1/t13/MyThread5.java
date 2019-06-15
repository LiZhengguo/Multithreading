package multithreading.chapter1.t13;

public class MyThread5 extends Thread{

	public void run() {
		try { 
			while(true) {
				if(this.isInterrupted()) {
					System.out.println("我要停止了！！");
					return;
				}
				System.out.println("运行中");
			}
		} catch (ThreadDeath e) { 
			System.out.println("MyThread5 catch");
			e.printStackTrace();
		}
	} 
}
