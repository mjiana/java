package chapter09;

//final�� ������ �����̵� ������ �� ���ٴ� ��
//final ���� : �� ����Ұ�
class Final{
	int money = 20000;
	final int day = 7;
	final int week = 4;
	final int month = 12;
	
	public Final() {
	}
}

public class FinalMain {
	public static void main(String[] args) {
		//final�� ������ �����̵� ������ �� ���ٴ� ���̴�.
		Final fi = new Final();
		fi.money = 30000;
		System.out.println("1���Ͽ뵷 : "+fi.money*fi.day);
	}

}
