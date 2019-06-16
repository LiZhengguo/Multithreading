package multithreading.chapter2.test2.t3;

public class MyThreadB extends Thread{

	private Task task ;
	
	public MyThreadB(Task task) {
		this.task = task;
	}
	
	public void run() {
		task.doLongTimeTask();
	}
}
