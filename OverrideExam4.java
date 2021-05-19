package chapter12;

class OverD{
	void show(int k) {
		System.out.println("OverD show(): "+ k*10 );
	}
	void prn(int i) {
		System.out.println("OverD prn(int): "+i);
	}
}
//������ü�� ������ü�� ��ӹ޾� ������ü�� �����ϰ� �ֱ� ������ ������ �� �д�.
class SubOverD extends OverD{
	void show(int i) { //�������̵�
		System.out.println("SubOverD show(): "+i*1000);
	}
	void prn(String s) { //������ü ���忡���� �����ε�
		System.out.println("SubOverD prn(String): "+s);
	}
	void scr() { //����Ŭ������ ���� Ȯ��(�߰�) �޼���
		System.out.println("scr():");
	}
}

public class OverrideExam4 {
	public static void main(String[] args) {
		//
		OverD od = new SubOverD();
		od.show(1); // SubOverD�� show()�� ���� <=== ������
		od.prn(1);
		
		//������ü�� ��ӹ��� ��������� ȣ���� �� ������, ������ü�� ��������� ȣ���� �� ����.
		//od.prn("111"); //���� �߻�
				
		//new�� ���ο� ��ü�� �����ع����Ƿ� ���� �ٸ� ��ü�� �Ǿ������.
		//SubOverD sod = new SubOverD();
		
		//������ü�� ����� �� ���� ������ ����� ȣ���ϱ� ���� ��ü ����ȯ�� ���
		SubOverD sod = (SubOverD) od; //��ü ����ȯ
		sod.show(2);
		sod.prn("aaa");
		sod.prn(2);
		sod.scr();
		
	}

}
