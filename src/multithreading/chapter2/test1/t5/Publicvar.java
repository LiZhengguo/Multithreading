package multithreading.chapter2.test1.t5;

public class Publicvar {
	
	private String username = "A";
	private String password = "AA";
	
	synchronized public void setValue(String name,String pwd) {
		try {
			this.username = name;
			Thread.sleep(5000);
			this.password = pwd;
			System.out.println("SetValue method thread name = "+Thread.currentThread().getName()+" username = " + this.username+" password = "+this.password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	synchronized public void getValue() {
		try { 
			System.out.println("GetValue method thread name = "+Thread.currentThread().getName()+" username = " + this.username+" password = "+this.password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
