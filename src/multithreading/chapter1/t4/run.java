package multithreading.chapter1.t4;

/**
 * 
 * ClassName: run
 * @Description: ��������:ʵ���������̰߳�ȫ  
 * @author 
 * company:����˹̹�¿Ƽ���չ���޹�˾
 * @date 2019��6��13������1:14:16
 */
public class run{
	/**
	 *  1������������
	 */
	public static void main(String[] args) {
		try {
			MyThread myThreadA = new MyThread("A");
			MyThread myThreadB = new MyThread("B");
			MyThread myThreadC = new MyThread("C");
			myThreadA.start();
			myThreadB.start();
			myThreadC.start(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	} 
}
