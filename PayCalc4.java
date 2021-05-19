package chapter07;

public class PayCalc4 {

	public static void main(String[] args) {
		//불러올 데이터가 많다면 객체변수 사용하기
		//PayCalc3에서 실 수령액 부분 절삭 기능 추가
		
		//Pay4에서 함수화 시켜서 불러오기
		Pay4 p1 = new Pay4();
		Pay4 p2 = new Pay4();
		
		p1.name = "왕눈이";
		p1.bonbong = 2194513;
		p1.setTex();
		p1.setSil();
		p1.prnPay();
		
		p2.name = "아롬이";
		p2.bonbong = 2573417;
		p2.setTex();
		p2.setSil();
		p2.prnPay();
	}

}
