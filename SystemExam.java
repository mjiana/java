package chapter18;

public class SystemExam {
	public static void testMethod(){
		System.out.println("100,000회 loop 시작");
		for(int i=0; i<100000; i++) {
			String str = new String("개구리 왕눈이");
		}
		System.out.println("100,000회 loop 종료");
	}
	public static void execTime() {
		long start, end;
		float time;
		
		start = System.currentTimeMillis();
		System.out.println("현재시간 : "+start);
		
		SystemExam.testMethod();
		
		end = System.currentTimeMillis();
		System.out.println("반복종료시간 : "+end);
		
		time = (end-start)/1000.0f;
		
		System.out.println("end-start : "+(end-start));
		System.out.println("반복 소요시간 : "+ time);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SystemExam.execTime();
	}

}
