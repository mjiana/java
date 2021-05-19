package chapter07;

public class PayCalc3 {

	public static void main(String[] args) {
		//자바의 주요장점인 객체지향을 가장 쉽게 표현한 방법
		// 이런 패턴으로 작성할 수 있도록 많이 연습하기
		//불러올 데이터가 많다면 객체변수 사용하기
		
		//Pay3에서 함수화 시켜서 불러오기
		Pay3 p1 = new Pay3();
		Pay3 p2 = new Pay3();
		
		p1.name = "왕눈이";
		p1.bonbong = 2000000;
		p1.setTex();
		p1.setSil();
		p1.prnPay();
		
		p2.name = "아롬이";
		p2.bonbong = 2500000;
		p2.setTex();
		p2.setSil();
		p2.prnPay();
	}

}
