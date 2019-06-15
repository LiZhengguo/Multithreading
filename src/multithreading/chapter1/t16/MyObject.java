package multithreading.chapter1.t16;

public class MyObject extends Thread{
	 private String username = "1";
	 private String password = "11";
	 public void setValue(String name,String pwd) {
		 this.username = name;
		 if(Thread.currentThread().getName().equals("A")){
			 System.out.println("Í£Ö¹AÏß³Ì!");
			 Thread.currentThread().suspend();
		 }
		 this.password = pwd;
	 }
	 
	 public void printlnValue() {
		 System.out.println(this.username + "__"+ this.password);
	 }
	 
}
