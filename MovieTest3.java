package chapter13;

class TV3 { //�Ͻ��� ȣ��(�ڵ�ȣ��) //��ӵ� �����̱� ����
	public TV3() {
		System.out.println("TV3");
	}
}
class Movie3 extends TV3{
	String part = "";

	public Movie3() {} //�⺻�����ڴ� �����ε� �� ��� �ڵ� ������ �ȵǹǷ� ����
	public Movie3(String part) {
		this.part = part;
		System.out.println("Movie3");
	}

}
class Comedy3 extends Movie3{
	String name;
	String time;

	public Comedy3() {} //�⺻�����ڴ� �����ε� �� ��� �ڵ� ������ �ȵǹǷ� ����
	public Comedy3(String time, String name, String part) {
		//�ݵ�� super�� �켱 ȣ���ϰ� �� ���� this�� ȣ���ϱ�
		//���� ������ �־�� �� ������ Ȯ����� ���� ������ �����ϱ� ����
		super(part); // ����� ȣ��
		this.time = time;
		this.name = name;
		System.out.println("Comedy3");
	}
}
public class MovieTest3 {
	public static void main(String[] args) {
		
		Comedy3 c = new Comedy3("11:00", "�����ǿ���", "�ѱ���ȭ");
		System.out.println(c.time);
		System.out.println(c.name);
		System.out.println(c.part);
	}

}
