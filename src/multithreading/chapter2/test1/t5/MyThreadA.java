package multithreading.chapter2.test1.t5;

public class MyThreadA extends Thread{

	private Publicvar var ;
	
	public MyThreadA(Publicvar var ) {
		this.var = var;
	}
	
	public void run() {
		var.setValue("B","BB");
	}
}
