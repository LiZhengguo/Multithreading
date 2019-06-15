package multithreading.chapter1.t6;


//本类模拟成一个Servlet 组件
public class LoginServlet {
	private static String username;
	private static String password;
	synchronized public static void doPost(String name,String pwd){
		try {
			username = name;
			if(username.equals("a")){
				Thread.sleep(5000);
			}
			password = pwd;
			System.out.println("username="+username + "   password="+password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
