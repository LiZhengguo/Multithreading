package multithreading.chapter1.t9;

/**
 * ���̲߳���Ϊ����������һ���߳�ʱ��this��Thread.currentThread()�������ϡ��������ͬһ�����󡣶����߳���Ϊ��������ʱ��
 * thisָ��ǰ���󣬼��ڲ��̣߳���Thread.currentThread()ָ��ǰ�������ĸ��̵߳��õ��Ǹ����󣬼��ⲿ�̡߳�
 * https://www.cnblogs.com/cing/p/8950716.html
 * 
 * ClassName: CountOperate
 * @Description: ��������:
 * @author 
 * company:����˹̹�¿Ƽ���չ���޹�˾
 * @date 2019��6��13������3:15:08
 */
public class CountOperate extends Thread{

	public CountOperate(){
		System.out.println("CountOperate----begin");
		System.out.println("Thread.currentThread().getName() =="+Thread.currentThread().getName());
		System.out.println("Thread.currentThread().isAlive() =="+Thread.currentThread().isAlive());
		System.out.println("this.getName() =="+this.getName());
		System.out.println("this.isAlive() =="+this.isAlive());
		System.out.println("CountOperate----end");
	}
	public void run(){
		System.out.println("run----begin");
		System.out.println("Thread.currentThread().getName() =="+Thread.currentThread().getName());
		System.out.println("Thread.currentThread().isAlive() =="+Thread.currentThread().isAlive());
		System.out.println("this.getName() =="+this.getName());
		System.out.println("this.isAlive() =="+this.isAlive());
		System.out.println("run----end");
	}
}
