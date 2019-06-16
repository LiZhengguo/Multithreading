package multithreading.chapter2.test2.t1;

public class Task {

	private String getData1;
	private String getData2;
	
	public synchronized void doLongTimeTask() {
		try {
			System.out.println("begin Task");
			Thread.sleep(3000);
			getData1 = "��ʱ�䴦��������Զ�̷���ֵ 1 ThreadName = "+ Thread.currentThread().getName();
			getData2 = "��ʱ�䴦��������Զ�̷���ֵ 2 ThreadName = "+ Thread.currentThread().getName();
			System.out.println(getData1);
			System.out.println(getData2);
			System.out.println("end Task");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
