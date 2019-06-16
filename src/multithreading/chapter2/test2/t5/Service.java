package multithreading.chapter2.test2.t5;

public class Service {

	private String username;
	private String password;
	
	private String anyString =new String();
	
	public void setUserNamePassword(String username,String password) {
		try {
//			anyString = new String();
			synchronized(anyString) {
				System.out.println("线程" + Thread.currentThread().getName()+"进入同步块");
				this.username = username;
				Thread.sleep(2000);
				this.password = password;
				System.out.println("线程" + Thread.currentThread().getName()+"离开同步块");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void b() {
		System.out.println("方法B begin");
		System.out.println("方法B end");
	}
	
	
}
