package chapter04;

public class SwitchTest2 {

	public static void main(String[] args) {
		// �ƽ�Ű�ڵ� �빮�� 65(A)~90(Z) �ҹ��� 97(a)~122(z)
		switch (98) {
			case 'A' : //65
				System.out.println("AAA"); break;
			case 'B' : //66
				System.out.println("BBB"); break;
			case 'a' : //97
				System.out.println("aaa"); break;
			case 'b' : //98
				System.out.println("bbb"); break;
			default : 
				System.out.println("no");
		}

	}

}
