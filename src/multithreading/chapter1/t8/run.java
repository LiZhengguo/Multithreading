package multithreading.chapter1.t8;

/**
 * 
 * ClassName: run
 * @Description: ��������:currentThread()���� �ɷ��ش������ڱ��Ǹ��̵߳��õ���Ϣ
 * @author 
 * company:����˹̹�¿Ƽ���չ���޹�˾
 * @date 2019��6��13������2:50:48
 */
public class run {

	public static void main(String[] args) {
		MyThread mythread = new MyThread();
//		mythread.start();
		mythread.run();
		
		
		CountOperate c = new CountOperate();
		Thread t1 = new Thread(c);
		t1.setName("A");
		t1.start();
	}

}
