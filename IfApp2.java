package chapter04;

public class IfApp2 {

	public static void main(String[] args) {
		//논리연산자 &&
		int k = 80;
		
		if(k%3 == 0 && k%5 == 0) {
			System.out.println("k = "+ k + ", 3의 배수이면서 5의 배수");
		}else {
			System.out.println("3과 5의 배수가 아니다");
		}
		
	}

}
