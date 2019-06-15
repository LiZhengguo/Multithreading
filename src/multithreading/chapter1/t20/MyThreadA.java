package multithreading.chapter1.t20;

public class MyThreadA extends Thread{
	private int count =0;
	public int getCount() {
		return count;
	}
	public void run() {
		while(true)
			count++;
	}
}
