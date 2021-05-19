package chapter16;

class GenClass{
	private int num;
	private String name;
	
	public GenClass(String a, int b) {
		name = a;
		num = b;
	}
	public void start() { //오버라이딩
		for(int i=0; i<num; i++) {
			System.out.println(name+":"+i);
		}
	}
}


public class NonThread {
	public static void main(String[] args) {
		// 단일 스레드
		GenClass g1 = new GenClass("first", 5);
		GenClass g2 = new GenClass("second", 5);
		GenClass g3 = new GenClass("third", 5);
		
		g1.start();
		g2.start();
		g3.start();
		
	}

}
