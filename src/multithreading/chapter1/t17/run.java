package multithreading.chapter1.t17;

/**
 *  yield() ����
 *  �����Ƿ�����ǰ��CPU��Դ�������ø���������ȥռ��CPUִ�е�ʱ�䣬���Ƿ���ʱ�䲻ȷ�����п��ܸոշ����������ֵõ�CPUʱ��Ƭ
 *
 */ 
public class run { 
	public static void main(String[] args) {
		try {
			MyThread t1 = new MyThread();
			t1.start();
			Thread.sleep(5000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
