package multithreading.chapter2.test1.t5;

public class run {

	/**
	 * ���
	 */
	public static void main(String[] args) {
		Publicvar var = new Publicvar();
		try {
			MyThreadA ta = new MyThreadA(var);
			ta.start();
			Thread.sleep(200);//��ӡ����ܴ�ֵ��СӰ��
			var.getValue();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * �� A �߳� ���� anyObject ������� synchronized �ؼ��ֵ� X����ʱA�߳̾ͻ����X����������׼ȷ�ؽ��ǻ���˶����������������̱߳����A�߳�ִ����ϲſ���
	 * ����X��������B�߳̿����������������synchronized ͬ������
	 * ��A�̵߳���anyObject�������synchronized �ؼ��ֵ�X����ʱ��A�߳̾ͻ����X�������ڵĶ����������������̱߳����A�߳�ִ����ϲſ��Ե���X��������
	 * B�߳�������������� ��synchronized �ؼ��ֵķ�X����ʱ�������A�߳̽�X����ִ���꣬Ҳ�����ͷŶ�������ſ��Ե��á�
	 * ��ʱA�߳��Ѿ�ִ������һ������������Ҳ����˵username��password������ʵ�������Ѿ�ͬʱ��ֵ�ɹ�������������Ļ�������
	 */
}
