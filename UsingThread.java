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
	Integer data; //Integer : int의 객체형 클래스, 레퍼(wrapper)클래스

	public void up(String n) {
		//synchronized : 특정 자원(객체변수, 메서드)에 두 개 이상의 스레드가 동시 접속하는 것을 금지한다
		synchronized (data) { 
			System.out.print(n+"가 "+data);
			data = new Integer(data.intValue()+1);
			System.out.println("를 "+data+"로 증가시킴");
		}
	}
	public void down(String n) {
		//처리되는걸 눈으로 볼 수 없다.
		synchronized (data) { //신뢰성과 관련이 깊다
			System.out.print(n+"가 "+data);
			data = new Integer(data.intValue()-1);
			System.out.println("를 "+data+"로 감소시킴");
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

		t1 = new IncThread(m, 2, "증가 스레드");
		t2 = new DecThread(m, 3, "감소 스레드");

		t1.start();
		t2.start();
	}

}
