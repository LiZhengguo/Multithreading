package multithreading.chapter2.test2.t5;

public class Run2 {

	/**
	 *�����н��������ͬ�����еĴ�����ͬ����ӡ�ģ���ǰ�߳�ִ�����˳��ǳɶԳ��ֵģ����߳�A���߳�B��ִ��ȴ���첽�ģ�����п��ܳ�������Ļ���
	 *�����߳�ִ�з�����˳��ȷ�������Ե�A��B�����߳�ִ�д��з�֧�жϵķ���ʱ���ͻ�����߼��ϵĴ����п��ܳ������
	 */
	public static void main(String[] args) {
		MyList list = new MyList();
		MyThreadListA la = new MyThreadListA(list);
		MyThreadListB lb = new MyThreadListB(list);
		
		la.setName("A");
		lb.setName("B");
		
		la.start();
		lb.start();
		
	}
}
