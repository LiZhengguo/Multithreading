package multithreading.chapter1.t2;

public class MyThread extends Thread{
	private int i;
	public MyThread(int i){
		super();
		this.i=i;
	}
	public void run (){ 
		try {
			System.out.println(i);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
