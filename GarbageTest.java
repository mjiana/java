package chapter12;

class Garbage{
	int objNo; //만약 생성자의 인자값과 동일한 명칭인 n이였다면 this.n필수
	
	public Garbage(int n) {
		objNo = n; //objNo는 유일한 변수명이기에 this.을 사용하지 않아도 가능
		System.out.println("Garbage class"+objNo+" 생성");
	}
	//callback Method
	protected void finalize() throws Throwable{
		System.out.println("Garbage class"+objNo+" 수집");
		super.finalize();
	}
}

public class GarbageTest {
	public static void main(String[] args) {
		
		Garbage[] g = new Garbage[10]; //객체배열변수 생성
		
		for(int i=0; i<g.length; i++) { 
			g[i] = new Garbage(i); //객체 생성
		}
		for(int i=0; i<g.length; i++) {
			g[i] = null; //메모리 참조 삭제
		}
		System.out.println("\n");
		System.gc(); // JVM에게 강제로 수거명령 전달 //잘 쓰이지는 않음
	}

}
