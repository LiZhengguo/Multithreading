package multithreading.chapter1.t13;

public class run2 {
	//œ»Õ£÷π‘Ÿ ”ˆµΩ sleep
	public static void main(String[] args)  {
		try {
			MyThread2 t1 = new MyThread2();
			t1.start(); 
			t1.interrupt(); 
			
		} catch (Exception e) { 
			e.printStackTrace();
		}
		System.out.println("end");
	} 
}
