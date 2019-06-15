package multithreading.chapter1.t6;

public class ALogin extends Thread{
	public void run(){
		LoginServlet.doPost("a", "aa");
	}
}
