package multithreading.chapter1.t9;

/**
 * 
 * ClassName: run
 * @Description: ��������: isAlive() �����жϵ�ǰ�߳��Ƿ��ڻ״̬
 * @author 
 * company:����˹̹�¿Ƽ���չ���޹�˾
 * @date 2019��6��13������2:58:42
 */
public class run2 {

	public static void main(String[] args) throws InterruptedException {
		CountOperate o = new  CountOperate();
		Thread t1 = new Thread(o);
		System.out.println("main begin t1 isAlive = "+t1.isAlive());
		t1.setName("A");
		t1.start();
		System.out.println("main end t1 isAlive = "+t1.isAlive());
	}

}
