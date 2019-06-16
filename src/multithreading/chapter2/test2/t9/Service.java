package multithreading.chapter2.test2.t9;

public class Service {

	synchronized public static void printA() {
		try {
			System.out.println("线程："+Thread.currentThread().getName()+"在 "+System.currentTimeMillis()+" 进入printA");
			Thread.sleep(2000);
			System.out.println("线程："+Thread.currentThread().getName()+"在 "+System.currentTimeMillis()+" 离开printA");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	synchronized public static void printB() {
		System.out.println("线程："+Thread.currentThread().getName()+"在 "+System.currentTimeMillis()+" 进入printB");
		System.out.println("线程："+Thread.currentThread().getName()+"在 "+System.currentTimeMillis()+" 离开printB");
	}
	synchronized public void printC() {
		System.out.println("线程："+Thread.currentThread().getName()+"在 "+System.currentTimeMillis()+" 进入printC");
		System.out.println("线程："+Thread.currentThread().getName()+"在 "+System.currentTimeMillis()+" 离开printC");
	}
	
	public static void printD() {
		synchronized (Service.class) {
			System.out.println("线程："+Thread.currentThread().getName()+"在 "+System.currentTimeMillis()+" 进入printD");
			System.out.println("线程："+Thread.currentThread().getName()+"在 "+System.currentTimeMillis()+" 离开printD");
		}
	}
	
}
