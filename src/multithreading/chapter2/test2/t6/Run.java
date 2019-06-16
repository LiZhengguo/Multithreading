package multithreading.chapter2.test2.t6;

public class Run {

	/**
	 * 
	  *    结果是2 的原因是 两个线程以异步的方式返回list参数size()的大小
	  *    解决方法是  “同步化”
	 * 	synchronized(list) {
	 *		if(list.getsize()<1) {
	 *			Thread.sleep(2000);//模拟从远程花费2秒取回数据
	 *			list.add(data);
	 *		}
	 *	}
	 */
	public static void main(String[] args) {
		try {
			MyOneList list = new MyOneList();
			MyThreadA  ta = new MyThreadA(list);
			MyThreadB tb = new MyThreadB(list);
			
			ta.setName("A");
			tb.setName("B");
			
			ta.start();
			tb.start();
			
			Thread.sleep(5000);
			
			System.out.println("ListSize:"+list.getsize());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
