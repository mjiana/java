package chapter16;

//ThreadŬ����(���߻�� ����)�� �̹� ��ӵǾ� ���� ��� Runnable �������̽� ����
//ThreadŬ���� ��� //Thread = Runnable�� ���� Ŭ����
class MyThread extends Thread{
	private int num;
	private String name;
	
	public MyThread(String a, int b) {
		name = a;
		num = b;
	} 
	public void run() { //�������̵� //run() : ������ �����ϰ� ȣ���� �Ұ����ϴ�.
		for(int i=0; i<num; i++) {
			System.out.println(name+":"+i);
		}
	}
	
}

public class ThreadTest1 {
	public static void main(String[] args) {
		// ��Ƽ������ : �� �Ѱ��� ��ġ�� ����
		MyThread t1 = new MyThread("first", 1000);
		MyThread t2 = new MyThread("second", 1000);
		MyThread t3 = new MyThread("third", 1000);
		
		t1.start(); //run()ȣ��
		t2.start();
		t3.start();
	}

}
