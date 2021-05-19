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
		return super.spd; //상위 클래스의 spd
	}
	public int getTruckSpd() {
		return this.spd; //현재 클래스의 spd
	}
	//main함수
	public static void main(String[] args) {
		//Truck t = new Truck(); //사용하지 않아도 객체영역 생성
		Truck t; //먼저 변수를 선언한뒤
		t = new Truck(); //필요에 따라 사용여부를 정하거나 생성 전 조건을 걸 수 있음
		t.speedUp(150);
		System.out.println("Truck Speed : "+t.getTruckSpd());
		System.out.println("Truck class spd : "+t.spd);
		System.out.println("Car Speed spd : "+t.getCarSpd());
	}

}
