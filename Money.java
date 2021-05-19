package chapter12;

class Chosun{
	String name = "Chosun";
}
//상속 : extends 하위클래스는 상위클래스를 포함한다. 하위[ 상위[ ] ]
class Korea extends Chosun{
	String k_name = "Korea";
	String name = "Korea"; //부모클래스와 자식클래스 변수명이 같을 때 
	
	public String sname() { 
		return super.name; //super를 통해 상위클래스의 명칭을 불러온다.
	}
}
public class Money {
	public static void main(String[] args) {
		
		Korea k = new Korea();
		//상속 : 자식(하위)클래스는 부모(상위) 클래스의 자원을 사용할 수 있다.
		System.out.println(k.name); //자식클래스 name
		System.out.println(k.k_name); //자식클래스 name
		System.out.println(k.sname());//부모클래스 name
	}

}
