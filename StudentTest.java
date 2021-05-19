package chapter14;

//�������̽� : ��� �޼��尡 �߻�޼���� �����ϰ�, ������ ����� ���·� �����Ѵ�.
//����Ŭ���� : ������ ��� �޼��带 ������
interface Student{ //�������̽�
	public void setName(String n);
	public String getName();
	public void setRank(int r);
	public int getRank();
}

//���(extends)�� �ƴ� ����(implements)�̶�� ǥ���ϰ� ���������� ����
//class��� interface�� ����ϰ�, �߻������� abstractŰ���带 ������ �ʴ´�
class StudentCon implements Student{ //����Ŭ����
	String name;
	int rank;
	
	public void setName(String n) {
		this.name = n;
	}
	public String getName() {
		return name;
	}
	public void setRank(int r) {
		this.rank = r;
	}
	public int getRank() {
		return rank;
	}
	public String prnName() { //���ȿ� �����ִٰ� �� ���Ǵ°� �ƴϴ�
		String s;
		s="�١١�";
		s+=name;
		s="�١١�";
		return s;
	}
}
public class StudentTest {
	public static void main(String[] args) {
		//�������̽�Ŭ���� �������̽���ü���� = new ����Ŭ����������();
		Student s = new StudentCon();
		s.setName("�ƹ���");
		System.out.println("name : "+s.getName());
		s.setRank(10);
		System.out.println("rank : "+s.getRank());
		
		//prnName�� ����Ŭ�������� �ִ� ���� Ȯ��޼����̹Ƿ� ���� ��ü������ �ؾ� �Ѵ�
		StudentCon sc = new StudentCon();
		System.out.println("name : "+sc.prnName());
	}

}
