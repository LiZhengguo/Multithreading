package multithreading.chapter2.test2.t1;

public class Task {

	private String getData1;
	private String getData2;
	
	public synchronized void doLongTimeTask() {
		try {
			System.out.println("begin Task");
			Thread.sleep(3000);
			getData1 = "长时间处理任务后从远程返回值 1 ThreadName = "+ Thread.currentThread().getName();
			getData2 = "长时间处理任务后从远程返回值 2 ThreadName = "+ Thread.currentThread().getName();
			System.out.println(getData1);
			System.out.println(getData2);
			System.out.println("end Task");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
