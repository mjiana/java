package chapter08;

//beanŬ������� �Ѵ�.
public class SetterGetterTest {
	//setter getter ����� ���� 
	
	//rule1. ������ private ����
	private String name;
	private int age;
	private String phone;
	private String address;
	private boolean marrige;
	private int[] math;
	//�������� �ٲ۴ٸ� ���� getter/setter�� ����� �ڵ����� �ٽ� �����
	//������ ��ġ������ : ������ get set�κ� ���� �� �����ؾ��ϴµ� �Ǽ� �� Ȯ���� �ſ� ����
	
	//setter getter�� �� �ڵ����� �����
	//��Ŭ���� ��� Source-Generate Getters and Setters-Select All-Finish
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isMarrige() {
		return marrige;
	}
	public void setMarrige(boolean marrige) {
		this.marrige = marrige;
	}
	public int[] getMath() {
		return math;
	}
	public void setMath(int[] math) {
		this.math = math;
	}
		
	
}
