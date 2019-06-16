package multithreading.chapter2.test1.t7;

public class Service {
	
	synchronized public void testMethod() {
		if(Thread.currentThread().getName().equals("A")) {
			System.out.println("Thread A run Time = "+System.currentTimeMillis());
			while(true) {
				if((""+ Math.random()).substring(0, 8).equals("0.123456")) {
					Integer.parseInt("a");
				}
			}
		}else {
			System.out.println("Thread B run Time = "+System.currentTimeMillis());
		}
	}
}
