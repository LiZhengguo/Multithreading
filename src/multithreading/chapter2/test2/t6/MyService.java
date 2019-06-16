package multithreading.chapter2.test2.t6;

public class MyService {

	public MyOneList addServiceMethod(MyOneList list,String data) {
		try {
			synchronized(list) {
				if(list.getsize()<1) {
					Thread.sleep(2000);//模拟从远程花费2秒取回数据
					list.add(data);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
