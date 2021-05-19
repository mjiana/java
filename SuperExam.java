package chapter13;

class Over{
	int i,j;
	
	public Over(int i, int j) {
		this.i = i;
		this.j = j;
	}
	void show() {
		System.out.println("상위클래스 show()");
	}
}
class SubOver extends Over{
	int k;

	public SubOver(int i, int j, int k) {
		super(i, j); //초기화 순서 주의
		this.k = k;
	}
	
	void show() {
		System.out.println("하위클래스 show()");
		System.out.println("==상위클래스==");
		super.show();
	}
}

public class SuperExam {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubOver so = new SubOver(10,20,30);
		System.out.println("i:"+ so.i+" j:"+so.j+" k:"+so.k);
		
		so.show();
	}

}
