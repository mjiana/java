package chapter09;

//final이 붙으면 무엇이든 변경할 수 없다는 뜻
//final 변수 : 값 변경불가
class Final{
	int money = 20000;
	final int day = 7;
	final int week = 4;
	final int month = 12;
	
	public Final() {
	}
}

public class FinalMain {
	public static void main(String[] args) {
		//final이 붙으면 무엇이든 변경할 수 없다는 뜻이다.
		Final fi = new Final();
		fi.money = 30000;
		System.out.println("1주일용돈 : "+fi.money*fi.day);
	}

}
