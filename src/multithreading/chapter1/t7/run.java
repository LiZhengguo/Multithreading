package multithreading.chapter1.t7;

/**
 * 
 * ClassName: run
 * @Description: ��������: i-- ��  System.out.println();  ���쳣
 * @author 
 * company:����˹̹�¿Ƽ���չ���޹�˾
 * @date 2019��6��13������1:14:16
 */
public class run{
	/**
	 *  1�����ݹ���    ���̰߳�ȫ
	 */
	public static void main(String[] args) {
		try {
			
			MyThread myThread = new MyThread();
			Thread a = new Thread(myThread,"A");
			Thread b = new Thread(myThread,"B");
			Thread c = new Thread(myThread,"C");
			Thread d = new Thread(myThread,"D");
			Thread e = new Thread(myThread,"E");
			
			a.start();
			b.start();
			c.start();
			d.start();
			e.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	} 
}
