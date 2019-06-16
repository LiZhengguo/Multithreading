package multithreading.chapter2.test2.t5;

public class Run {

	/**
	 * ����this�������һ�����ŵ㣺�����һ�������кܶ��synchronized ���� ����ʱ��Ȼ�ܹ�ʵ��ͬ���������ܵ���������Ӱ������Ч��
	 * �����ʹ��ͬ�����������this������synchronized(��this)������еĳ�����ͬ���������첽�ģ�����������thisͬ����������this��
	 * ���������Ч��
	 * ʹ��synchronized(��this����x)ͬ������飬���������������ͬһ�������������ͬһ����������������еĽ�������첽�����ˣ��ͻύ������
	 * 
	 * �����������ͬ�����н�����첽��
	 */
	public static void main(String[] args) {
		Service service = new Service();
		
		MyThreadA ta = new MyThreadA(service);
		MyThreadB tb = new MyThreadB(service);
		
		ta.setName("A");
		tb.setName("B");
		
		ta.start();
		tb.start();
		
	}
}
