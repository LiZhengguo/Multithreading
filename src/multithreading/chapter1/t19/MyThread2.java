package multithreading.chapter1.t19;

import java.util.Random;

public class MyThread2 extends Thread{
	
	public void run() {
		long beginTime = System.currentTimeMillis();
		long addResult = 0;
		for(int j=0;j<10;j++) {
			for(int i=0;i<50000;i++) {
				Random random = new Random();
				random.nextInt();
				addResult = addResult+i;
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("------------ Thread2 use  time = "+(endTime - beginTime));
	}
}
