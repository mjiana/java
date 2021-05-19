package chapter05_Star;

public class Star8 {

	public static void main(String[] args) {
		// 마름모꼴 만들기 ◆  //☆★
		
		int val = 6; //마름모 사이즈를 정하는 변수

		/* 아래로 갈수록 가로로 늘어나는 정삼각형 만들기  ▲ */
		for(int up_i=0; up_i<=val; up_i++) { //i가 val보다 크거나 같을때까지 증가
			for(int up_j=0; up_j<=(val+up_i); up_j++) {  //j는 val과 i를 더한 값보다 크거나 같아질때까지 증가
				if((up_i+up_j) >= val) { //i와 j를 더한 값이  val과 같거나 클때만  ★출력
					System.out.print("★"); 
				} else { //공백 처리
					System.out.print("☆");
				}
			}
			System.out.println();
		}/*up for문 닫기*/
		/* 아래로 갈수록 가로로 줄어드는 정삼각형 ▼ */
		for(int down_i=(val-1); down_i>=0; down_i--) { //
			for(int down_j=0; down_j<=(val+down_i); down_j++) { //j는 val과 i를 더한 값보다 크거나 같아질때까지 증가
				if((down_i+down_j) >= val) { //i와 j를 더한 값이  val과 같거나 클때만  ★출력
					System.out.print("★"); 
				} else { //공백 처리
					System.out.print("☆");
				}
			}
			System.out.println();
		}/*down for문 닫기*/
	}

}
