package chapter07;

public class PayCalc5 {

	public static void main(String[] args) {
		//PatCalc3에서 객체변수화 시킨 것
				
		//Pay5에서 함수화 시켜서 불러오기
		Pay5[] p = new Pay5[2]; //변수 선언
		p[0] = new Pay5(); //인스턴스화
		p[1] = new Pay5(); //인스턴스화
		
		p[0].name = "왕눈이";
		p[0].bonbong = 2416891;
		p[1].name = "아롬이";
		p[1].bonbong = 2598732;
		
		for(int i=0; i<p.length; i++) {
			p[i].setTex();
			p[i].setSil();
			p[i].prnPay();
		}
	}

}
