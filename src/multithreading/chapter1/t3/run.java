package multithreading.chapter1.t3;

/**
 * 
 * ClassName: run
 * @Description: ��������: ʵ��Runnable �ӿ�
 * @author 
 * company:����˹̹�¿Ƽ���չ���޹�˾
 * @date 2019��6��13������1:18:51
 */
public class run{
	public static void main(String[] args) {
		try {
			Runnable runnable = new MyRunnable();
			Thread thread = new Thread(runnable);
			thread.start();
			System.out.println("���н���......");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
