package multithreading.chapter1.t0;

/**
 * 
 * ClassName: run
 * @Description: ��������:�������н�������ִ��˳������˳���޹�
 * @author 
 * company:����˹̹�¿Ƽ���չ���޹�˾
 * @date 2019��6��13������1:14:16
 */
public class run{
	
	public static void main(String[] args) {
		try {
			MyThread myThread = new MyThread();
			myThread.start();
			System.out.println("���н�����"); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
