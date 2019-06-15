package multithreading.chapter1.t4;

public class MyThread extends Thread{
	private int count = 5;
	public MyThread(String name){
		super();
		this.setName(name);//设置线程名称
		
	}
	public void run (){
		super.run();
		while (count>0){
			count--;
			System.out.println("由 "+this.currentThread().getName()+" 计算  count= "+count);
		} 
	}
}
