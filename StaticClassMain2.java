package chapter09;

class StaticClass2{
	public static StaticClass2 sc;
	int k = 100;
	
	public static StaticClass2 getInstance() {
		if(sc==null) {
			sc = new StaticClass2();
		}
		return sc;
	}
}

public class StaticClassMain2 {
	public static void main(String[] args) {
		// ������ ��ü �������� ������ ���� ����
		StaticClass2 sc = new StaticClass2();
		StaticClass2 sc2 = new StaticClass2();
		
		System.out.println("sc.hashcode : "+ sc.hashCode());
		sc.k = 1000;
		System.out.println("sc.k : "+sc.k);
		
		System.out.println("sc2.hashcode : "+ sc2.hashCode());
		sc2.k = 1500;
		System.out.println("sc2.k : "+ sc2.k);
		System.out.println("sc.k : "+sc.k);
		
		System.out.println("-----------------");
		// �̱��� ���� = �ϳ��� ��ü�� �޾Ƶ鿩 ���� ���۷������� ����
		StaticClass2 sc3 = StaticClass2.getInstance();
		StaticClass2 sc4 = StaticClass2.getInstance();
		
		System.out.println("sc3.hashCode: "+sc3.hashCode());
		sc3.k = 2000;
		System.out.println("sc3.k : "+sc3.k);
		System.out.println("sc4.hashCode: "+sc4.hashCode());
		sc4.k = 2500;
		System.out.println("sc4.k : "+sc4.k);
		System.out.println("sc3.k : "+sc3.k);
		
	}

}
