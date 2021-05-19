package chapter08;

public class MethodTestMain7 {

	public static void main(String[] args) {
		// getter 호출한 곳으로 멤버변수를 return하는 역할
		// getter로 값을 가져오면 원본의 값을 보호할 수 있다.
		// setter 인자를 받아서 멤버변수를 초기화 하는 역할
		// 1클래스 1생성자이므로 생성자에 입력된 값을 바꿀 때 setter 사용
		
		MethodTest7 mt = new MethodTest7(90, 90);
		mt.calcTot();
		mt.calcAvg();
		mt.prn();
		System.out.println("setter------");
		mt.setKuk(80);
		mt.setEng(80);
		
		mt.calcTot();
		mt.calcAvg();
		
		System.out.println("총점 : "+mt.getTot());
		System.out.println("평균 : "+mt.getAvg());
	}

}
