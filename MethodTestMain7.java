package chapter08;

public class MethodTestMain7 {

	public static void main(String[] args) {
		// getter ȣ���� ������ ��������� return�ϴ� ����
		// getter�� ���� �������� ������ ���� ��ȣ�� �� �ִ�.
		// setter ���ڸ� �޾Ƽ� ��������� �ʱ�ȭ �ϴ� ����
		// 1Ŭ���� 1�������̹Ƿ� �����ڿ� �Էµ� ���� �ٲ� �� setter ���
		
		MethodTest7 mt = new MethodTest7(90, 90);
		mt.calcTot();
		mt.calcAvg();
		mt.prn();
		System.out.println("setter------");
		mt.setKuk(80);
		mt.setEng(80);
		
		mt.calcTot();
		mt.calcAvg();
		
		System.out.println("���� : "+mt.getTot());
		System.out.println("��� : "+mt.getAvg());
	}

}
