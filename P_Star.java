package study; //chpater17����

/* cmdâ���� �����Ϸ��� ���
cd C:\java_bigdata\mywork_java\ //�ڹ� ���� �ִ� ������ �̵�
dir //���� �� �ڹ� ���� ��ġ Ȯ��
javac -d . Hello.java // ������ //-d . ������ġ���� ��Ű��  ����
java a.Hello //���� //��Ű���� �����ϴ� ���������� ����
*/
public class P_Star {
	public String show() {
		return "�١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١�";
	}
	public static void main(String[] args) {

		P_Star p = new P_Star();
		System.out.println(p.show());
	}

}
