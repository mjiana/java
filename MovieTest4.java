package chapter13;

class TV4 { //����� ��ü���� ���⿡ �ܵ� Ŭ����
	public TV4() {
		System.out.println("TV4");
	}
}
class Movie4{  //TV4�� ��Ӱ��� �ƴ�
	String part = "";

	public Movie4() {} //�⺻�����ڴ� �����ε� �� ��� �ڵ� ������ �ȵǹǷ� ����
	public Movie4(String part) {
		this.part = part;
		System.out.println("Movie4");
	}

}
class Comedy4 extends Movie4{
	String name ="";
	String time = "�󿵿�������";

	public Comedy4() {} //�⺻�����ڴ� �����ε� �� ��� �ڵ� ������ �ȵǹǷ� ����
	public Comedy4(String time, String name, String part) {
		//�ݵ�� super�� �켱 ȣ���ϰ� �� ���� this�� ȣ���ϱ�
		//���� ������ �־�� �� ������ Ȯ����� ���� ������ �����ϱ� ����
		super(part); // ����� ȣ��
		this.time = time;
		this.name = name;
		System.out.println("Comedy4");
	}
}
public class MovieTest4 {
	public static void main(String[] args) {
		
		Comedy4 c = new Comedy4("11:00", "�����ǿ���", "�ѱ���ȭ");
		System.out.println("====================================");
		System.out.println(c.time);
		System.out.println(c.name);
		System.out.println(c.part);
		System.out.println("====================================");
		Comedy4 c3 = new Comedy4();
		//c3.name = "�����ǿ���2";
		System.out.println(c3.time);
		System.out.println(c3.name);
		System.out.println(c3.part);
		
	}

}
