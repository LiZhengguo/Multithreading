package multithreading.chapter2.test1.t4;

public class run {
	/**
	 * 验证 synchronized锁是 对象锁
	 * 
	 * 调用synchronized声明的方法一定是排队运行的
	 */
	
	public static void main(String[] args) {
		MyObject object = new MyObject();
		MyThreadA ta =new MyThreadA(object);
		ta.setName("A");
		MyThreadB tb = new MyThreadB(object);
		tb.setName("B");
		
		ta.start();
		tb.start();
		
		
		
	}
}
