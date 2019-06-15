package multithreading.chapter1.t6;

public class BLogin extends Thread{
	public void run(){
		LoginServlet.doPost("b", "bb");
	}
}
