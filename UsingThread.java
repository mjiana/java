package chapter16;

class IncThread extends Thread{
	MainData m;
	int toAdd;
	String name;

	public IncThread(MainData m, int ta, String n) {
		this.m = m;
		this.toAdd = ta;
		this.name = n;
		System.out.println("IncThread m.hashcode : "+m.hashCode());
	}
	public void run() {
		for(int i=0; i<toAdd; i++) {
			try {
				sleep(5); // 5/1000
			} catch (Exception e) { }
			
			m.up(name);
		}
	}
}

class DecThread extends Thread{
	MainData m;
	int toAdd;
	String name;

	public DecThread(MainData m, int ta, String n) {
		this.m = m;
		this.toAdd = ta;
		this.name = n;
		System.out.println("DecThread m.hashcode : "+m.hashCode());
	}
	public void run() {
		for(int i=0; i<toAdd; i++) {
			try {
				sleep(5); // 5/1000
			} catch (Exception e) { }
			
			m.down(name);
		}
	}
}

class MainData{
	Integer data; //Integer : int�� ��ü�� Ŭ����, ����(wrapper)Ŭ����

	public void up(String n) {
		//synchronized : Ư�� �ڿ�(��ü����, �޼���)�� �� �� �̻��� �����尡 ���� �����ϴ� ���� �����Ѵ�
		synchronized (data) { 
			System.out.print(n+"�� "+data);
			data = new Integer(data.intValue()+1);
			System.out.println("�� "+data+"�� ������Ŵ");
		}
	}
	public void down(String n) {
		//ó���Ǵ°� ������ �� �� ����.
		synchronized (data) { //�ŷڼ��� ������ ���
			System.out.print(n+"�� "+data);
			data = new Integer(data.intValue()-1);
			System.out.println("�� "+data+"�� ���ҽ�Ŵ");
		}
	}
}

public class UsingThread {
	public static void main(String[] args) {
		
		MainData m = new MainData();

		m.data = new Integer(0);
		System.out.println("Using Thread m.hashCode : "+m.hashCode());

		IncThread t1;
		DecThread t2;

		t1 = new IncThread(m, 2, "���� ������");
		t2 = new DecThread(m, 3, "���� ������");

		t1.start();
		t2.start();
	}

}
