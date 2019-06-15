package multithreading.chapter2.test1.t6;

public class Sub extends Main{

	synchronized public void operateISubMethod() {
		try {
			while(i>0) {
				i--;
				System.out.println("sub pring i = " + i);
				Thread.sleep(100);
				this.operateIMainMethod();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
			
}
