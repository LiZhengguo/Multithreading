package multithreading.chapter2.test1.t8;

public class Main {

	synchronized public void mainMethod() {
		try {
			System.out.println("int main 下一步 sleep begin threadName = " +Thread.currentThread().getName()+" time = "+System.currentTimeMillis() );
			Thread.sleep(5000);
			System.out.println("int main 下一步 sleep end threadName = " +Thread.currentThread().getName()+" time = "+System.currentTimeMillis() );
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
