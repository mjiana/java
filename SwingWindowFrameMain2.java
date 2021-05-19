package chapter28;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//WindowAdapter를 상속받고 ActionListner 인터페이스 적용
class SwingWindowFrame2 extends WindowAdapter implements ActionListener{
	private JFrame f; //선언만 되어있는 상태
	private JButton b;
	
	public SwingWindowFrame2() { //생성자가 호출되었을 때 
		f = new JFrame("Window Event Test"); //메모리 할당
		b = new JButton("제목 바꾸기");
		Container c = f.getContentPane();
		
		c.setLayout(new FlowLayout()); //배치방법 : 일렬
		c.add(b); //추가(붙이기)
		
		b.addActionListener(this); //버튼에 액션리스너 적용
		f.addWindowListener(this); //프레임에 윈도우리스너 적용
		
		f.setSize(300, 100); //창 사이즈 지정
		f.setVisible(true); //보여줄 것인지 여부
	}
	
	//인터페이스를 적용(implements)받았다면 모든 추상메서드를 재정의 해야하지만
	//WindowAdapter는 WindowListner의 구현클래스이므로 
	//상속(extends)받는 클래스는 필요한 메서드만 재정의하면 된다.
	public void windowClosing(WindowEvent e) { //닫히는 중에 처리할 이벤트
		System.exit(0);
	}
	//이벤트 자동 실행, ActionListener의 추상메서드
	public void actionPerformed(ActionEvent e) {
		f.setTitle("액션리스너와 윈도우리스너");
	}
}
//메인함수
public class SwingWindowFrameMain2 {
	public static void main(String[] args) {
		//생성자 호출
		new SwingWindowFrame2();
	}

}
