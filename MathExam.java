package chapter18;

public class MathExam {
	public static void main(String[] args) {
		//Math.�޼���()�� ��κ��� ���� ����� ����
		System.out.println("abs : "+Math.abs(-100));
		System.out.println("ceil : "+Math.ceil(1.1)); //�ø��Լ�
		System.out.println("floor : "+Math.floor(1.9)); //�����Լ�
		System.out.println("(int) (a+0.5f) : "+(int)(10.5+0.5f));
		System.out.println("round(10.4) : "+Math.round(10.4)); //�ݿø��Լ�
		System.out.println("round(10.5) : "+Math.round(10.5)); //4���� ����
		System.out.println("round(10.6) : "+Math.round(10.6)); //5�̻�  �ø�
		System.out.println("----------------------------------------");
		
		double d;
		for(int i=0; i<=4; i++) {
			d = Math.random();
			int min = 100;
			int max = 105;
			
			System.out.println(((int)(d*((max-min)+1))+min));
		}
	}

}
