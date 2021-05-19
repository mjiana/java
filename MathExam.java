package chapter18;

public class MathExam {
	public static void main(String[] args) {
		//Math.메서드()는 대부분이 정적 멤버로 구성
		System.out.println("abs : "+Math.abs(-100));
		System.out.println("ceil : "+Math.ceil(1.1)); //올림함수
		System.out.println("floor : "+Math.floor(1.9)); //내림함수
		System.out.println("(int) (a+0.5f) : "+(int)(10.5+0.5f));
		System.out.println("round(10.4) : "+Math.round(10.4)); //반올림함수
		System.out.println("round(10.5) : "+Math.round(10.5)); //4이하 내림
		System.out.println("round(10.6) : "+Math.round(10.6)); //5이상  올림
		System.out.println("----------------------------------------");
		
		double d;
		for(int i=0; i<=4; i++) {
			d = Math.random();
			int min = 100;
			int max = 105;
			
			System.out.println(((int)(d*((max-min)+1))+min));
		}
	}

}
