package chapter08;

//bean클래스라고 한다.
public class SetterGetterTest {
	//setter getter 만들기 연습 
	
	//rule1. 변수는 private 선언
	private String name;
	private int age;
	private String phone;
	private String address;
	private boolean marrige;
	private int[] math;
	//변수명을 바꾼다면 차라리 getter/setter를 지우고 자동으로 다시 만들기
	//손으로 고치지말것 : 변수명 get set부분 전부 다 변경해야하는데 실수 할 확률이 매우 높음
	
	//setter getter는 꼭 자동으로 만들기
	//이클립스 상단 Source-Generate Getters and Setters-Select All-Finish
		
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
