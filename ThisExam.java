package chapter13;

class ThisData{
	//�������� �ʱ�ȭ���� �ʾƵ� 0�� ���� ������ ����
	int i,j,k; //this.i/this.j/this.k�� ����Ű�� ��ġ

	public ThisData() { //�����ε��� �ٸ� �����ڵ�� ������ �����̱⿡ ���⸦ ����Ű�� ����
		this.i = 0;
		this.j = 0;
		this.k = 0;
	}
	public ThisData(int i) {
		this.i = i; //this(i)�� ����Ű�� ��ġ
	}
	public ThisData(int i, int j) {
		this(i);
		this.j = j;
	}
}

public class ThisExam {
	public static void main(String[] args) {
		
		ThisData d = new ThisData(100,90);
		
		System.out.println("d.i="+d.i);
		System.out.println("d.j="+d.j);
		System.out.println("d.k="+d.k);
	}

}
