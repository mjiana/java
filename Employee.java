package chapter11;

class Pay1{
	String name = "";
	int pay = 0;
	int comm = 0;
	int tax = 0;
	
	public Pay1(String name, int pay, int comm) {
		this.name = name;
		this.pay = pay;
		this.comm = comm;
		comm = 100000;
		System.out.println("Pay1������ comm : "+comm);
	}
	public void tax() {
		tax = (int)(pay*0.05);
	}
	public int earn() {
		int total = (pay+comm)-tax;
		return total;
	}
}

public class Employee {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "�Ʒι�";
		int pay = 1500000;
		int comm = 200000;
		
		System.out.println("comm ������ �ʱⰪ :"+comm);
		
		Pay1 p = new Pay1(name, pay, comm); //call by value
		System.out.println("main �޼ҵ� comm : "+comm);
		System.out.println("p.hashCode : "+p.hashCode());
		
	}

}
