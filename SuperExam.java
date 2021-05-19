package chapter13;

class Over{
	int i,j;
	
	public Over(int i, int j) {
		this.i = i;
		this.j = j;
	}
	void show() {
		System.out.println("����Ŭ���� show()");
	}
}
class SubOver extends Over{
	int k;

	public SubOver(int i, int j, int k) {
		super(i, j); //�ʱ�ȭ ���� ����
		this.k = k;
	}
	
	void show() {
		System.out.println("����Ŭ���� show()");
		System.out.println("==����Ŭ����==");
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
