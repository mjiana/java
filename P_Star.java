package study; //chpater17연습

/* cmd창에서 실행하려는 경우
cd C:\java_bigdata\mywork_java\ //자바 파일 있는 폴더로 이동
dir //폴더 내 자바 파일 위치 확인
javac -d . Hello.java // 컴파일 //-d . 현재위치에서 패키지  생성
java a.Hello //실행 //패키지가 시작하는 곳에서부터 시작
*/
public class P_Star {
	public String show() {
		return "☆★☆★☆★☆★☆★☆★☆★";
	}
	public static void main(String[] args) {

		P_Star p = new P_Star();
		System.out.println(p.show());
	}

}
