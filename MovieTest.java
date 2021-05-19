package chapter13;

class TV { //�Ͻ��� ȣ��(�ڵ�ȣ��) //��ӵ� �����̱� ����
	public TV() {
		System.out.println("TV");
	}
}
class Movie extends TV{
	String part = "";
	
	public Movie() {} //�⺻�����ڴ� �����ε� �� ��� �ڵ� ������ �ȵǹǷ� ����
	public Movie(String part) {
		this.part = part; 
		System.out.println("Movie");
	}
	
}
class Comedy extends Movie{
	String time;
	String name;
	
	public Comedy() {} //�⺻�����ڴ� �����ε� �� ��� �ڵ� ������ �ȵǹǷ� ����
	public Comedy(String time, String name, String part) {
		//�ݵ�� super�� �켱 ȣ���ϰ� �� ���� this�� ȣ���ϱ�
		//���� ������ �־�� �� ������ Ȯ����� ���� ������ �����ϱ� ����
		super(part); // ����� ȣ��
		this.time = time;
		this.name = name;
		System.out.println("Comedy");
	}
}
public class MovieTest {
	public static void main(String[] args) {
		
		Comedy c = new Comedy("21:00","�����ǿ���2","�ѱ���ȭ");
		System.out.println(c.time);
		System.out.println(c.name);
		System.out.println(c.part);
		
		Comedy c2 = new Comedy();
		c2.time = "17:00";
		c2.name = "�����ǿ���";
		c2.part = "�ѱ���ȭ";
		System.out.println(c2.time);
		System.out.println(c2.name);
		System.out.println(c2.part);
	}

}
