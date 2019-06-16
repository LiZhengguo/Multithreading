package multithreading.chapter2.test1.t7;

public class run {
	/**+
	 * ��һ���̳߳��� �쳣ʱ�������е������Զ��ͷ�
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Service service = new Service();
			ThreadA ta = new ThreadA(service);
			ThreadB tb = new ThreadB(service);
			
			ta.setName("A");
			tb.setName("B");
			
			ta.start();
			Thread.sleep(500);
			tb.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
