package chapter11;

class Pay2{
	String name = "";
	int pay = 0;
	int comm = 0;
	int tax = 0;
	// String�� ��ü�������� ���ڷ� ���Ǹ� call by value�� �۵��Ѵ�.
	public Pay2(String name, int pay, int comm) {
		this.name = name;
		this.pay = pay;
		this.comm = comm;
		comm = 100000;
		System.out.println("Pay2������ comm : "+comm);
	}
	public void tax() {
		tax = (int)(pay*0.05);
	}
	public int earn() {
		int total = (pay+comm)-tax;
		return total;
	}
}
//���� ��ü�� ����Ǿ� �־ ���� ����Ǹ� ����� ��ü����(ȣ������-��������)�� ������ ����
class PrintPay2{
	public static void PrintPay(Pay2 p) { //��ü�� �����ڷ� ���
		System.out.println("-------------------");
		System.out.println("���� : "+p.name);
		System.out.println("���� : "+p.pay);
		System.out.println("���ʽ� : "+p.comm);
		System.out.println("���� : "+p.tax);
		System.out.println("�� ���ɾ� : "+p.earn());
		
		
		p.tax = 5000;
		System.out.println("-------------------");
		System.out.println("p.hashCode : "+p.hashCode());
	}
}

public class Employee_arg2 {
	public static void main(String[] args) {
		// String�� ��ü�������� ���ڷ� ���Ǹ� call by value�� �۵��Ѵ�.
		Pay2 p = new Pay2("�մ���",10000,1000);
		
		p.tax();
		
		//��ü�� ����Ǿ��־ ���� ����Ǹ� ����� ��ü�� ���� �����
		PrintPay2.PrintPay(p); //call by reference
		//PrintPay2.PrintPay(p); // �� �ڵ忡�� ����� ���� �ѹ� �� �����⿡ ���� �޶���
		System.out.println("p.hashCode : "+p.hashCode());
	}

}
