package multithreading.chapter2.test1.t4;

public class run {
	/**
	 * ��֤ synchronized���� ������
	 * 
	 * ����synchronized�����ķ���һ�����Ŷ����е�
	 */
	
	public static void main(String[] args) {
		MyObject object = new MyObject();
		MyThreadA ta =new MyThreadA(object);
		ta.setName("A");
		MyThreadB tb = new MyThreadB(object);
		tb.setName("B");
		
		ta.start();
		tb.start();
		
		
		
	}
}
