package multithreading.chapter1.t6;


//����ģ���һ��Servlet ���
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
