package multithreading.chapter2.test2.t6;

public class MyService {

	public MyOneList addServiceMethod(MyOneList list,String data) {
		try {
			synchronized(list) {
				if(list.getsize()<1) {
					Thread.sleep(2000);//ģ���Զ�̻���2��ȡ������
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
