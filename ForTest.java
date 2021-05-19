package chapter05;

public class ForTest {

	public static void main(String[] args) {
		// for문안에 변수를 선언하면 for문 밖에서는 사용할 수 없다.
		for(int i=1; i<=5; i++) { //증감 순서를 변경할 수 없다.
			System.out.print("▥"); //줄바꿈없이 한줄로
		}
		System.out.println("\n");
		for(int i=1; i<=5; i++) {
			System.out.println("▨"); //한줄에 하나씩
		}
	}

}
