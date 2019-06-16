package multithreading.chapter2.test2.t2;

public class Run {
	/**
	 * ʹ�� synchronized �ؼ��� �����ķ��� ������ʱ���������׶˺�����
	 * 
	 * ��һ���̷߳���object ��һ�� synchronized ͬ�������ʱ ��һ���߳���Ȼ���Է���object�����еķ�synchronized(this)
	 * ͬ�������
	 * 
	 * ���� synchronized���еĴ������첽ִ�еģ���synchronized���е���ͬ��ִ�е�
	 * 
	 */

	public static void main(String[] args) {
		try {
			Task task = new Task();
			MyThreadA ta = new MyThreadA(task);
			MyThreadB tb = new MyThreadB(task);
			
			ta.start();
			tb.start();
			
			Thread.sleep(5000);
			
			long beginTime = CommonUtils.beginTime1;
			if(CommonUtils.beginTime2 < CommonUtils.beginTime1) {
				beginTime = CommonUtils.beginTime2;
			}
			
			long endTime = CommonUtils.endTime1;
			
			if(CommonUtils.endTime2 > CommonUtils.endTime1) {
				endTime  = CommonUtils.endTime2;
			}
			
			System.out.println("��ʱ��"+((endTime-beginTime)/1000));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
