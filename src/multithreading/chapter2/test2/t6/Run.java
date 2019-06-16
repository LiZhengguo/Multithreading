package multithreading.chapter2.test2.t6;

public class Run {

	/**
	 * 
	  *    �����2 ��ԭ���� �����߳����첽�ķ�ʽ����list����size()�Ĵ�С
	  *    ���������  ��ͬ������
	 * 	synchronized(list) {
	 *		if(list.getsize()<1) {
	 *			Thread.sleep(2000);//ģ���Զ�̻���2��ȡ������
	 *			list.add(data);
	 *		}
	 *	}
	 */
	public static void main(String[] args) {
		try {
			MyOneList list = new MyOneList();
			MyThreadA  ta = new MyThreadA(list);
			MyThreadB tb = new MyThreadB(list);
			
			ta.setName("A");
			tb.setName("B");
			
			ta.start();
			tb.start();
			
			Thread.sleep(5000);
			
			System.out.println("ListSize:"+list.getsize());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
