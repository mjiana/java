package chapter08;

public class MethodTestMain6 {

	public static void main(String[] args) {
		// getter ȣ���� ������ ��������� return�ϴ� ����
		//getter�� ���� �������� ������ ���� ��ȣ�� �� �ִ�.
		
		MethodTest6 mt = new MethodTest6(90, 80);
		mt.calcTot();
		mt.calcAvg();
		mt.prn();
		
		int tot = mt.getTot();
		float avg = mt.getAvg();
		
		System.out.println("���� : "+tot);
		System.out.println("��� : "+avg);
	}

}
