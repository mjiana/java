package chapter09;
//싱글톤 패턴
class StaticClass{
	public static StaticClass sc = null; // null로 초기화 하지 않아도 기본값이 null
	int kuk = 100;
}

public class StaticClassMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticClass sc = new StaticClass();
		StaticClass sc2 = new StaticClass();
		
		System.out.println("sc.hashcode : "+sc.hashCode());
		System.out.println("sc.kuk : "+ sc.kuk);
		System.out.println("sc2.hashcode : "+sc2.hashCode());
		System.out.println("sc2.kuk : "+ sc2.kuk);
	}

}
