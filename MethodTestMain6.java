package chapter08;

public class MethodTestMain6 {

	public static void main(String[] args) {
		// getter 호출한 곳으로 멤버변수를 return하는 역할
		//getter로 값을 가져오면 원본의 값을 보호할 수 있다.
		
		MethodTest6 mt = new MethodTest6(90, 80);
		mt.calcTot();
		mt.calcAvg();
		mt.prn();
		
		int tot = mt.getTot();
		float avg = mt.getAvg();
		
		System.out.println("총점 : "+tot);
		System.out.println("평균 : "+avg);
	}

}
