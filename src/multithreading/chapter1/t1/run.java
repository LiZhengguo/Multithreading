package multithreading.chapter1.t1;

/**
 * 
 * ClassName: run
 * @Description: ��������: �̵߳��õ������            �첽?
 * @author 
 * company:����˹̹�¿Ƽ���չ���޹�˾
 * @date 2019��6��13������1:17:11
 */
public class run{
	public static void main(String[] args) {
		try { 
			MyThread myThread = new MyThread();
			myThread.setName("myThread");
			myThread.start();
			for (int i = 0; i < 10; i++) {
				int time = (int) (Math.random() * 1000);
				Thread.sleep(time);
				System.out.println("main="+Thread.currentThread().getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
