package multithreading.chapter1.t13;

public class run4 {
	//stop 与 java.lang.ThreadDeath 异常
	//调用 stop 方法时会抛出java.lang.ThreadDeath 异常但在通常情况下此异常不需要显示地捕捉
	public static void main(String[] args)  {
		try {
			MyThread4 t1 = new MyThread4(); 
			t1.start();
		} catch (Exception e) { 
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end");
	} 
}
