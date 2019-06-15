package multithreading.chapter2.test1.t3;

public class HasSelfPrivateNum {
	private int num =0;
	synchronized public void addI(String name) {
		try {
			if(name.equals("a")) {
				num =100;
				System.out.println("a set over");
				Thread.sleep(2000);
			}else {
				num = 200;
				System.out.println("b set over");
			}
			System.out.println(name+" num = "+num);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
