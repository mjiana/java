package chapter16;

class RunThread4 extends Thread{
	public RunThread4(String name) {
		super(name);
	}
	public void run() {
		for(int i=0; i <= 300; i++) {
			if(i%50 == 0) 
				System.out.println("Thread ["+getName()+"] : "+i);
			try {
				//동시성 sleep()과 우선순위 setPriority()는 서로서로 방해하기 때문에 같이 사용하면 안 된다.
				sleep(1);
			} catch (Exception e) {
				System.out.println("[오류발생] : "+e.toString());
			}
		}
	}
}

public class SchedulingTest4 {
	public static void main(String[] args) {
		//누가 우선순위인지 예측할 수 없다
		Thread[] t = new RunThread4[3];
		
		t[0] = new RunThread4("☆");
		t[1] = new RunThread4("◇");
		t[2] = new RunThread4("△");
		//동시성 sleep()과 우선순위 setPriority()는 서로서로 방해하기 때문에 같이 사용하면 안 된다.
		//setPriority()안의 숫자(1-10사이)가 높을 수록 마지막에 출력될 확률이 높아진다
		t[0].start();
		t[0].setPriority(10);
		
		t[1].start();
		t[1].setPriority(5);
		
		t[2].start();
		t[2].setPriority(1);
		
		System.out.println("t[0]"+t[0].getPriority());
		System.out.println("t[1]"+t[1].getPriority());
		System.out.println("t[2]"+t[2].getPriority());
	}

}
