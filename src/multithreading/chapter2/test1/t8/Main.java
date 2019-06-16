package multithreading.chapter2.test1.t8;

public class Main {

	synchronized public void mainMethod() {
		try {
			System.out.println("int main ��һ�� sleep begin threadName = " +Thread.currentThread().getName()+" time = "+System.currentTimeMillis() );
			Thread.sleep(5000);
			System.out.println("int main ��һ�� sleep end threadName = " +Thread.currentThread().getName()+" time = "+System.currentTimeMillis() );
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
