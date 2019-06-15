package multithreading.chapter2.test1.t6;

public class Main {
	public int i=10;
	synchronized public void operateIMainMethod() {
		try {
			i--;
			System.out.println("main pring i "+i);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
			
}
