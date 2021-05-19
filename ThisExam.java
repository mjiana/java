package chapter13;

class ThisData{
	//정수값은 초기화되지 않아도 0의 값을 가지고 있음
	int i,j,k; //this.i/this.j/this.k가 가르키는 위치

	public ThisData() { //오버로딩된 다른 생성자들과 동일한 선상이기에 여기를 가르키지 않음
		this.i = 0;
		this.j = 0;
		this.k = 0;
	}
	public ThisData(int i) {
		this.i = i; //this(i)가 가르키는 위치
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
