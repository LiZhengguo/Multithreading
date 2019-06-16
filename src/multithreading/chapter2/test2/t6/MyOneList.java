package multithreading.chapter2.test2.t6;

import java.util.ArrayList;
import java.util.List;

public class MyOneList {

	private List list = new ArrayList();
	
	synchronized public void add(String data) {
		list.add(data);
	}
	synchronized public int getsize() {
		return list.size();
	}
	
	
}
