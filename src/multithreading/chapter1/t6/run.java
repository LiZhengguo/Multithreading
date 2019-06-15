package multithreading.chapter1.t6;
/**
 * 
 * ClassName: run
 * @Description: 功能描述: 解决非线程安全问题
 * @author 
 * company:北京斯坦德科技发展有限公司
 * @date 2019年6月13日下午1:46:33
 */
public class run {
	public static void main(String[] args) {
		ALogin a = new ALogin();
		a.start();
		BLogin b = new BLogin();
		b.start();
	}
}
