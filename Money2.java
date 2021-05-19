package chapter12;

class Chosun2{
	String name = "Chosun";
	public String attack() {
		return "활";
	}
}
//상속 : extends 하위클래스는 상위클래스를 포함한다. 하위[ 상위[ ] ]
class Korea2 extends Chosun2{
	String k_name = "Korea";
	public String k_attack() {
		return "K2 소총";
	}
}
public class Money2 {
	public static void main(String[] args) {
		//상속 : 자식(하위)클래스는 부모(상위) 클래스의 자원을 사용할 수 있다.
		Korea2 k = new Korea2();
		System.out.println(k.attack()); //부모클래스
		System.out.println(k.k_attack()); //자식클래스
		
		//상속 : 부모(상위)클래스는 자식(하위)클래스의 자원을 사용할 수 없다.
		Chosun2 c = new Chosun2();//부모클래스
		System.out.println(c.attack());
		
	}

}
