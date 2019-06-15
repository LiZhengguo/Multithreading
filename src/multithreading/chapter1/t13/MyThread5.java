package multithreading.chapter1.t13;

public class MyThread5 extends Thread{

	public void run() {
		try { 
			while(true) {
				if(this.isInterrupted()) {
					System.out.println("��Ҫֹͣ�ˣ���");
					return;
				}
				System.out.println("������");
			}
		} catch (ThreadDeath e) { 
			System.out.println("MyThread5 catch");
			e.printStackTrace();
		}
	} 
}
