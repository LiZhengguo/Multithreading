package multithreading.chapter2.test2.t5;

public class Service {

	private String username;
	private String password;
	
	private String anyString =new String();
	
	public void setUserNamePassword(String username,String password) {
		try {
//			anyString = new String();
			synchronized(anyString) {
				System.out.println("�߳�" + Thread.currentThread().getName()+"����ͬ����");
				this.username = username;
				Thread.sleep(2000);
				this.password = password;
				System.out.println("�߳�" + Thread.currentThread().getName()+"�뿪ͬ����");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void b() {
		System.out.println("����B begin");
		System.out.println("����B end");
	}
	
	
}
