package chapter12;

class Garbage{
	int objNo; //���� �������� ���ڰ��� ������ ��Ī�� n�̿��ٸ� this.n�ʼ�
	
	public Garbage(int n) {
		objNo = n; //objNo�� ������ �������̱⿡ this.�� ������� �ʾƵ� ����
		System.out.println("Garbage class"+objNo+" ����");
	}
	//callback Method
	protected void finalize() throws Throwable{
		System.out.println("Garbage class"+objNo+" ����");
		super.finalize();
	}
}

public class GarbageTest {
	public static void main(String[] args) {
		
		Garbage[] g = new Garbage[10]; //��ü�迭���� ����
		
		for(int i=0; i<g.length; i++) { 
			g[i] = new Garbage(i); //��ü ����
		}
		for(int i=0; i<g.length; i++) {
			g[i] = null; //�޸� ���� ����
		}
		System.out.println("\n");
		System.gc(); // JVM���� ������ ���Ÿ�� ���� //�� �������� ����
	}

}
