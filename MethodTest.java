package chapter08;

public class MethodTest {
	//String name;���� �����ϸ� null(�����Ҽ�����)�̰� String name=""���� �����ϸ� empty(���� ����) ����
	String name = ""; 
	int kuk = 0;
	int eng = 0;
	int tot = 0;
	float avg = 0.0f;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodTest mt = new MethodTest();
		
		mt.kuk = 100;
		mt.eng = 70;
		
		mt.tot = mt.kuk + mt.eng;
		mt.avg = mt.tot/2;
		
		System.out.println("���� : "+mt.kuk);
		System.out.println("���� : "+mt.eng);
		System.out.println("���� : "+mt.tot);
		System.out.println("��� : "+mt.avg);
	}

}
