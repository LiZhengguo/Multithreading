package multithreading.chapter2.test1.t1;

public class run {

	/**
	 * �����еı��������� ���̰߳�ȫ���⣬��Զ�����̰߳�ȫ�����Ƿ����ڲ��ı�����˽�е�������ɵ�
	 * 
	 */
	public static void main(String[] args) {
		HasSelfPrivateNum numRef = new HasSelfPrivateNum();
		MyThreadA ta = new MyThreadA(numRef);
		MyThreadB tb = new MyThreadB(numRef);
		
		ta.start();
		tb.start();
		
	}
}
