package chapter08;

public class Calc {
	public void add(int k, int e) {
		System.out.println("+ : "+ (k+e));
	}
	public int sub(int k, int e) {
		return k-e;
	}
	public int mul(int k, int e) {
		return k*e;
	}
	public static void main(String[] args) {
		
		Calc c = new Calc();
		int a = 100;
		int b = 200;
		
		// call by value
		c.add(a, b); 
		// ��ȯ�� void�� ��� sysout���� �� ǥ�� 
		System.out.println("- : "+ c.sub(a, b));
		System.out.println("* : "+c.mul(a, b));
		

	}

}
