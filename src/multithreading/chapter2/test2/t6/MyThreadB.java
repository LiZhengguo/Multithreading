package multithreading.chapter2.test2.t6;

public class MyThreadB extends Thread{

	private MyOneList list;
	public MyThreadB(MyOneList list) {
		this.list = list;
	}
	public void run() {
		MyService ms = new MyService();
		ms.addServiceMethod(list, "B");
	}
}
