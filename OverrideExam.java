package chapter12;

class OverA{
	void show(String str) {
		System.out.println("����Ŭ���� �޼ҵ� show(str) : "+str);
	}
}
class SubOverA extends OverA{
	void show() { //����Ŭ������ ���ڰ� �ٸ��⿡ �����ε� ���
		System.out.println("����Ŭ���� �޼ҵ� show()");
	}
}

public class OverrideExam {
	public static void main(String[] args) {
		// �����ε�
		SubOverA s = new SubOverA();
		s.show("AaAaAa");
		s.show();
	}

}
