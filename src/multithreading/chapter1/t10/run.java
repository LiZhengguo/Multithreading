package multithreading.chapter1.t10;

/**
 * 
 * ClassName: run
 * @Description: ��������: sleep() ��ָ���ĺ��������õ�ǰ������ִ�е��̡߳����ߣ���ִͣ�У� ���������ִ�е��̡߳� ��
 * this this.currentThread()���ص��߳�
 * @author 
 * company:����˹̹�¿Ƽ���չ���޹�˾
 * @date 2019��6��13������2:58:42
 */
public class run {

	public static void main(String[] args) throws InterruptedException {
		MyThread mythread = new MyThread();
		System.out.println("begin == " +System.currentTimeMillis());
		mythread.start(); 
		System.out.println("end == " +System.currentTimeMillis());
	}

}
