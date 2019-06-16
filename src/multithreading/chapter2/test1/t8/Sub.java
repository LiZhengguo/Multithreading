package multithreading.chapter2.test1.t8;

public class Sub extends Main{

	synchronized public void subMethod() {
		try {
			System.out.println("int sub 下一步 sleep begin threadName = " +Thread.currentThread().getName()+" time = "+System.currentTimeMillis() );
			Thread.sleep(5000);
			System.out.println("int sub 下一步 sleep end threadName = " +Thread.currentThread().getName()+" time = "+System.currentTimeMillis() );
			super.mainMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
