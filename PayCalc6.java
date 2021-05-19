package chapter07;

import java.util.Scanner; //콘솔에 키보드로 값을 입력받으려는 외부참조

public class PayCalc6 {
	//PatCalc5에서 콘솔창에서 값을 입력 받는 기능 추가
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		//Pay6에서 함수화 시켜서 불러오기
		Pay6[] p = new Pay6[2]; //변수 선언
		p[0] = new Pay6(); //인스턴스화
		p[1] = new Pay6(); //인스턴스화

		System.out.println("직원의 이름과 본봉을 입력하면 세금과 실수령액을 계산해드립니다.");
		for(int i=0; i< p.length; i++) {

			System.out.print((i+1)+"번 직원의 이름 : ");
			p[i].name = s.next();

			System.out.print((i+1)+"번 직원의 본봉 : ");
			p[i].bonbong = Integer.parseInt(s.next()); //문자열이 입력되었을때 에러표시 대신 입력하고 싶은데 해결이 안된다.
			//System.out.println(s.hasNextInt());
			

			if(i >=1) {
				for(int j = i-1; j<=i; j++) {
					System.out.println("--------------------");
					p[j].setTex();
					p[j].setSil();
					p[j].prnPay();
					
				}
				
			}
		}

	}

}
