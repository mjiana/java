package chapter13;

class Car{
	public int spd;
	public Car() {
		System.out.println("Car");
	}
}

public class Truck extends Car {
	int spd;
	
	public Truck() {
		System.out.println("Truck");
	}
	public void speedUp(int s) {
		spd = s;
	}
	public int getCarSpd() {
		return super.spd; //���� Ŭ������ spd
	}
	public int getTruckSpd() {
		return this.spd; //���� Ŭ������ spd
	}
	//main�Լ�
	public static void main(String[] args) {
		//Truck t = new Truck(); //������� �ʾƵ� ��ü���� ����
		Truck t; //���� ������ �����ѵ�
		t = new Truck(); //�ʿ信 ���� ��뿩�θ� ���ϰų� ���� �� ������ �� �� ����
		t.speedUp(150);
		System.out.println("Truck Speed : "+t.getTruckSpd());
		System.out.println("Truck class spd : "+t.spd);
		System.out.println("Car Speed spd : "+t.getCarSpd());
	}

}
