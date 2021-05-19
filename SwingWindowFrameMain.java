package chapter28;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//클래스를 상속받지 않고 인터페이스 다중적용
class SwingWindowFrame implements ActionListener, WindowListener{
	private JFrame f; //선언만 되어있는 상태
	private JButton b;
	
	public SwingWindowFrame() { //생성자가 호출되었을 때 
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
	//WindowListner의 추상메서드들을 전부 다 재정의 해야하지만 필요없기 때문에 {}로 처리
	public void windowActivated(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {} //끝난 후에 처리
	public void windowDeactivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}
	
	public void windowClosing(WindowEvent e) { //닫히는 중에
		System.exit(0);
	}
	//이벤트 자동 실행, ActionListener의 추상메서드
	public void actionPerformed(ActionEvent e) {
		f.setTitle("액션리스너와 윈도우리스너");
	}
}
//메인함수
public class SwingWindowFrameMain {
	public static void main(String[] args) {
		//생성자 호출
		new SwingWindowFrame();
	}

}
