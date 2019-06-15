package multithreading.chapter1.t14;

public class SynchronizedObject {
	private String userName = "a";
	private String password = "aa";
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	synchronized public void printString(String username,String password) {
		try {
			this.userName = username;
			Thread.sleep(10000);
			this.password=password;
		} catch (Exception e) { 
			e.printStackTrace();
		}
	}
}
