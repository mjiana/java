package chapter18;

public class ComepareTo {
	public static void main(String[] args) {
		String s1 = "������";
		String s2 = "����";
		
		System.out.println(s1.compareTo(s2));
		
		//compareTo�� ũ�� �񱳸� �� �� �ִ�.
		if(s1.compareTo(s2) < 0)
			System.out.println("s1�� �۰� s2�� ū ���ڿ�");
		if(s1.compareTo(s2) == 0)
			System.out.println("s1�� s2�� ���� ���ڿ�");
		if(s1.compareTo(s2) > 0)
			System.out.println("s1�� ũ�� s2�� ���� ���ڿ�");
	}

}
