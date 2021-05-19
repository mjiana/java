package chapter16;

//ThreadŬ����(���߻�� ����)�� �̹� ��ӵǾ� ���� ��� ���
//Runnable �������̽� ����
class ThreadOne implements Runnable { //Runnable�� ������ Ŭ���� = Ÿ�� Ŭ����
	private int num;
	private String name;
	
	public ThreadOne(String a, int b) {
		name = a;
		num = b;
	}
	public void run() { //�������̵� //run() : ������ �����ϰ� ȣ���� �Ұ����ϴ�.
		for(int i=0; i<num; i++) {
			System.out.println(name+":"+i);
		}
	}
	
}

public class ThreadTest2 {
	public static void main(String[] args) {
		//interface�� �̿��Ͽ� �ν��Ͻ��� �����ϴ� ���
		//Thread = Runnable�� ���� Ŭ����
		//start()�� ThreadŬ������ �ۿ� �����Ƿ� ThreadŬ������ �̿��ؾ� ��
					//Thread(Ÿ��Ŭ���� ������());
		Thread t1 = new Thread(new ThreadOne("first", 1000));
		Thread t2 = new Thread(new ThreadOne("second", 1000));
		Thread t3 = new Thread(new ThreadOne("third", 1000));
		
		t1.start();
		t2.start();
		t3.start();
	}

}
