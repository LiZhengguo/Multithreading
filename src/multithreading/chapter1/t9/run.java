package multithreading.chapter1.t9;

/**
 * 
 * ClassName: run
 * @Description: ��������: isAlive() �����жϵ�ǰ�߳��Ƿ��ڻ״̬
 * @author 
 * company:����˹̹�¿Ƽ���չ���޹�˾
 * @date 2019��6��13������2:58:42
 */
public class run {

	public static void main(String[] args) throws InterruptedException {
		MyThread mythread = new MyThread();
		System.out.println("begin == " +mythread.isAlive());
		mythread.start();
		Thread.sleep(1000);
		System.out.println("end == " +mythread.isAlive());
	}

}
