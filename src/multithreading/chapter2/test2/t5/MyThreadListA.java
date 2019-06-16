package multithreading.chapter2.test2.t5;

public class MyThreadListA extends Thread{

	private MyList list ;
	
	public MyThreadListA(MyList list) {
		this.list = list;
	}
	
	public void run() {
		for(int i=0;i<10000;i++) {
			list.add("ThreadA"+(i+1));
		}
	}
}
