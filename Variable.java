package chapter10;

public class Variable {

	String movie = "Ʈ����";
	public void show() {
		System.out.println("show���� : "+ movie);
	}
	public void title() {
		String movie = "�ٶ��� ����";
		System.out.println("title �޼ҵ念�� : "+movie);
		System.out.println("title �޼ҵ念�� : "+this.movie);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variable v = new Variable();
		v.show();
		v.title();
	}

}
