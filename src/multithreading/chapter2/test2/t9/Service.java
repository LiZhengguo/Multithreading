package multithreading.chapter2.test2.t9;

public class Service {

	synchronized public static void printA() {
		try {
			System.out.println("�̣߳�"+Thread.currentThread().getName()+"�� "+System.currentTimeMillis()+" ����printA");
			Thread.sleep(2000);
			System.out.println("�̣߳�"+Thread.currentThread().getName()+"�� "+System.currentTimeMillis()+" �뿪printA");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	synchronized public static void printB() {
		System.out.println("�̣߳�"+Thread.currentThread().getName()+"�� "+System.currentTimeMillis()+" ����printB");
		System.out.println("�̣߳�"+Thread.currentThread().getName()+"�� "+System.currentTimeMillis()+" �뿪printB");
	}
	synchronized public void printC() {
		System.out.println("�̣߳�"+Thread.currentThread().getName()+"�� "+System.currentTimeMillis()+" ����printC");
		System.out.println("�̣߳�"+Thread.currentThread().getName()+"�� "+System.currentTimeMillis()+" �뿪printC");
	}
	
	public static void printD() {
		synchronized (Service.class) {
			System.out.println("�̣߳�"+Thread.currentThread().getName()+"�� "+System.currentTimeMillis()+" ����printD");
			System.out.println("�̣߳�"+Thread.currentThread().getName()+"�� "+System.currentTimeMillis()+" �뿪printD");
		}
	}
	
}
