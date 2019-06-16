package multithreading.chapter2.test2.t5;

import java.util.ArrayList;
import java.util.List;

public class MyList {
	
	private List list = new ArrayList();
	
	synchronized public void add (String username) {
		System.out.println("Threadname = "+Thread.currentThread().getName()+"ִ����add������");
		list.add(username);
		System.out.println("Threadname = "+Thread.currentThread().getName()+"�˳���add������");
		System.out.println();
	}
	
	synchronized public int getSize () {
		System.out.println("Threadname = "+Thread.currentThread().getName()+"ִ����getSize������");
		int size = list.size();
		System.out.println("Threadname = "+Thread.currentThread().getName()+"�˳���getSize������");
		return size;
	}
	
}
