package chapter16;

//Thread클래스(다중상속 금지)가 이미 상속되어 있을 경우 Runnable 인터페이스 적용
//Thread클래스 상속 //Thread = Runnable의 구현 클래스
class MyThread extends Thread{
	private int num;
	private String name;
	
	public MyThread(String a, int b) {
		name = a;
		num = b;
	} 
	public void run() { //오버라이딩 //run() : 구현만 가능하고 호출이 불가능하다.
		for(int i=0; i<num; i++) {
			System.out.println(name+":"+i);
		}
	}
	
}

public class ThreadTest1 {
	public static void main(String[] args) {
		// 멀티스레드 : 단 한개라도 겹치면 인정
		MyThread t1 = new MyThread("first", 1000);
		MyThread t2 = new MyThread("second", 1000);
		MyThread t3 = new MyThread("third", 1000);
		
		t1.start(); //run()호출
		t2.start();
		t3.start();
	}

}
