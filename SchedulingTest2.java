package chapter16;

class RunThread2 extends Thread{
	public RunThread2(String name) {
		super(name);
	}
	public void run() {
		for(int i=0; i <= 10000; i++) {
			if(i%50 == 0) 
				System.out.println("Thread ["+getName()+"] : "+i);
				try {
					sleep(1);
					//System.out.print("sleep");
				} catch (Exception e) {
					System.out.println("[오류발생] : "+e.toString());
				}
		}
		//System.out.println();
	}
}

public class SchedulingTest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread[] t = new RunThread2[3];
		
		t[0] = new RunThread2("○");
		t[1] = new RunThread2("●");
		t[2] = new RunThread2("◆");
		
		t[0].start();
		t[1].start();
		t[2].start();
		
	}

}
