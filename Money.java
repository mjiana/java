package chapter12;

class Chosun{
	String name = "Chosun";
}
//��� : extends ����Ŭ������ ����Ŭ������ �����Ѵ�. ����[ ����[ ] ]
class Korea extends Chosun{
	String k_name = "Korea";
	String name = "Korea"; //�θ�Ŭ������ �ڽ�Ŭ���� �������� ���� �� 
	
	public String sname() { 
		return super.name; //super�� ���� ����Ŭ������ ��Ī�� �ҷ��´�.
	}
}
public class Money {
	public static void main(String[] args) {
		
		Korea k = new Korea();
		//��� : �ڽ�(����)Ŭ������ �θ�(����) Ŭ������ �ڿ��� ����� �� �ִ�.
		System.out.println(k.name); //�ڽ�Ŭ���� name
		System.out.println(k.k_name); //�ڽ�Ŭ���� name
		System.out.println(k.sname());//�θ�Ŭ���� name
	}

}
