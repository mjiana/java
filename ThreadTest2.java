package chapter16;

//Thread클래스(다중상속 금지)가 이미 상속되어 있을 경우 사용
//Runnable 인터페이스 적용
class ThreadOne implements Runnable { //Runnable을 적용한 클래스 = 타겟 클래스
	private int num;
	private String name;
	
	public ThreadOne(String a, int b) {
		name = a;
		num = b;
	}
	public void run() { //오버라이딩 //run() : 구현만 가능하고 호출이 불가능하다.
		for(int i=0; i<num; i++) {
			System.out.println(name+":"+i);
		}
	}
	
}

public class ThreadTest2 {
	public static void main(String[] args) {
		//interface를 이용하여 인스턴스를 생성하는 경우
		//Thread = Runnable의 구현 클래스
		//start()는 Thread클래스에 밖에 없으므로 Thread클래스를 이용해야 함
					//Thread(타겟클래스 생성자());
		Thread t1 = new Thread(new ThreadOne("first", 1000));
		Thread t2 = new Thread(new ThreadOne("second", 1000));
		Thread t3 = new Thread(new ThreadOne("third", 1000));
		
		t1.start();
		t2.start();
		t3.start();
	}

}
