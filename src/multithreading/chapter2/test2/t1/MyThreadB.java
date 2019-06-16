package multithreading.chapter2.test2.t1;

public class MyThreadB extends Thread{

	private Task task;
	public MyThreadB(Task task) {
		this.task = task;
	}
	
	public void run() {
		CommonUtils.beginTime2 = System.currentTimeMillis();
		task.doLongTimeTask();
		CommonUtils.endTime2 = System.currentTimeMillis();
	}
}
