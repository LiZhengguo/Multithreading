package multithreading.chapter1.t13;

public class run5 {
	// ”√ return Õ£÷πœﬂ≥Ã
	public static void main(String[] args)  {
		try {
			MyThread5 t1 = new MyThread5(); 
			t1.start();
			Thread.sleep(2000);
			t1.interrupt();
		} catch (Exception e) { 
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end");
	} 
}
