package multithreading.chapter1.t6;
/**
 * 
 * ClassName: run
 * @Description: ��������: ������̰߳�ȫ����
 * @author 
 * company:����˹̹�¿Ƽ���չ���޹�˾
 * @date 2019��6��13������1:46:33
 */
public class run {
	public static void main(String[] args) {
		ALogin a = new ALogin();
		a.start();
		BLogin b = new BLogin();
		b.start();
	}
}
