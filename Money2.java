package chapter12;

class Chosun2{
	String name = "Chosun";
	public String attack() {
		return "Ȱ";
	}
}
//��� : extends ����Ŭ������ ����Ŭ������ �����Ѵ�. ����[ ����[ ] ]
class Korea2 extends Chosun2{
	String k_name = "Korea";
	public String k_attack() {
		return "K2 ����";
	}
}
public class Money2 {
	public static void main(String[] args) {
		//��� : �ڽ�(����)Ŭ������ �θ�(����) Ŭ������ �ڿ��� ����� �� �ִ�.
		Korea2 k = new Korea2();
		System.out.println(k.attack()); //�θ�Ŭ����
		System.out.println(k.k_attack()); //�ڽ�Ŭ����
		
		//��� : �θ�(����)Ŭ������ �ڽ�(����)Ŭ������ �ڿ��� ����� �� ����.
		Chosun2 c = new Chosun2();//�θ�Ŭ����
		System.out.println(c.attack());
		
	}

}
