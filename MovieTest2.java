package chapter13;

class TV2 { //�Ͻ��� ȣ��(�ڵ�ȣ��) //��ӵ� �����̱� ����
	public TV2() {
		System.out.println("TV2");
	}
}
class Movie2 extends TV2{
	String part = "�ѱ���ȭ";
	
	public Movie2() {} //�⺻�����ڴ� �����ε� �� ��� �ڵ� ������ �ȵǹǷ� ����
	public Movie2(String part) {
		this.part = part;
		System.out.println("Movie2");
	}
	
}
class Action2 extends Movie2{
	String name;
	
	public Action2() {
		System.out.println("Action2");
	}
}
public class MovieTest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Action2 a = new Action2();
		a.name = "���ϵ�";
		System.out.println(a.name);
		
	}

}
