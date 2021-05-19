package chapter07;

import java.text.DecimalFormat; //천단위 ,위한 외부참조

//PayCalc3 계산을 위한 변수, 함수 선언
//선언, 초기화 외의 코드는 함수로 감싸서 사용해야 한다.
public class Pay3 {
	
	DecimalFormat df = new DecimalFormat("###,##0");
	String name;
	int bonbong;
	int tex;
	int sil;
	
	
	public void setTex() {
		tex = (int)(bonbong*0.05 + 0.5);
	}
	public void setSil() {
		sil = bonbong - tex;
	}
	public void prnPay() {
		System.out.println("성명 : "+name);
		System.out.println("본봉 : "+df.format(bonbong)+"원");
		System.out.println("세금 : "+df.format(tex)+"원");
		System.out.println("실 수령액 : "+df.format(sil)+"원");
		
	}
	
}
