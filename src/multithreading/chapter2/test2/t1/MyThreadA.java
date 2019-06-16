package multithreading.chapter2.test2.t1;

public class MyThreadA extends Thread{

	private Task task;
	public MyThreadA(Task task) {
		this.task = task;
	}
	
	public void run() {
		CommonUtils.beginTime1 = System.currentTimeMillis();
		task.doLongTimeTask();
		CommonUtils.endTime1 = System.currentTimeMillis();
	}
}
