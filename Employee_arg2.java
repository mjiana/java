package chapter11;

class Pay2{
	String name = "";
	int pay = 0;
	int comm = 0;
	int tax = 0;
	// String은 객체형이지만 인자로 사용되면 call by value로 작동한다.
	public Pay2(String name, int pay, int comm) {
		this.name = name;
		this.pay = pay;
		this.comm = comm;
		comm = 100000;
		System.out.println("Pay2생성자 comm : "+comm);
	}
	public void tax() {
		tax = (int)(pay*0.05);
	}
	public int earn() {
		int total = (pay+comm)-tax;
		return total;
	}
}
//같은 객체가 연결되어 있어서 값이 변경되면 연결된 객체영역(호출인자-수신인자)에 영향을 받음
class PrintPay2{
	public static void PrintPay(Pay2 p) { //객체를 가인자로 사용
		System.out.println("-------------------");
		System.out.println("성명 : "+p.name);
		System.out.println("본봉 : "+p.pay);
		System.out.println("보너스 : "+p.comm);
		System.out.println("세금 : "+p.tax);
		System.out.println("실 수령액 : "+p.earn());
		
		
		p.tax = 5000;
		System.out.println("-------------------");
		System.out.println("p.hashCode : "+p.hashCode());
	}
}

public class Employee_arg2 {
	public static void main(String[] args) {
		// String은 객체형이지만 인자로 사용되면 call by value로 작동한다.
		Pay2 p = new Pay2("왕눈이",10000,1000);
		
		p.tax();
		
		//객체로 연결되어있어서 값이 변경되면 연결된 객체의 값도 변경됨
		PrintPay2.PrintPay(p); //call by reference
		//PrintPay2.PrintPay(p); // 위 코드에서 실행된 값을 한번 더 돌리기에 값이 달라짐
		System.out.println("p.hashCode : "+p.hashCode());
	}

}
