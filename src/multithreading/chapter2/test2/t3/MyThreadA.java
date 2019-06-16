package multithreading.chapter2.test2.t3;

public class MyThreadA extends Thread{

	private Task task ;
	
	public MyThreadA(Task task) {
		this.task = task;
	}
	
	public void run() {
		task.doLongTimeTask();
	}
}
