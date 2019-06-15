package multithreading.chapter1.t12;

public class MyThread extends Thread{
	
	public void run() {
		try {
			super.run();
			for(int i=0;i<50000;i++) {
				if(this.interrupted()) {
					System.out.println("�߳��Ѿ�ֹͣ������");
//				break;
					throw new InterruptedException();
				}
				System.out.println("i=" + (i+1));
			}
			System.out.println("���� for ���棬�������ִ�У���");
		} catch (InterruptedException e) {
			System.out.println("����MyThread.java��run�����е�catch�ˣ���");
			e.printStackTrace();
		}
	} 
}
