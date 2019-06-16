package multithreading.chapter2.test2.t1;

public class Run {
	/**
	 * 使用 synchronized 关键字 声明的方法 从运行时间上来看弊端很明显
	 */

	public static void main(String[] args) {
		try {
			Task task = new Task();
			MyThreadA ta = new MyThreadA(task);
			MyThreadB tb = new MyThreadB(task);
			
			ta.start();
			tb.start();
			
			Thread.sleep(10000);
			
			long beginTime = CommonUtils.beginTime1;
			if(CommonUtils.beginTime2 < CommonUtils.beginTime1) {
				beginTime = CommonUtils.beginTime2;
			}
			
			long endTime = CommonUtils.endTime1;
			
			if(CommonUtils.endTime2 > CommonUtils.endTime1) {
				endTime  = CommonUtils.endTime2;
			}
			
			System.out.println("耗时："+((endTime-beginTime)/1000));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
