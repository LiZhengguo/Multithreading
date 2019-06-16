package multithreading.chapter2.test2.t5;

public class MyThreadListB extends Thread{

	private MyList list ;
	
	public MyThreadListB(MyList list) {
		this.list = list;
	}
	
	public void run() {
		for(int i=0;i<10000;i++) {
			list.add("ThreadB"+(i+1));
		}
	}
}
