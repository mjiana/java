package chapter28;

import java.awt.*;
import javax.swing.*;

class SwingComFrame extends JFrame{
	private JLabel la = new JLabel("레이블 테스트"); //문자열 출력
	private JButton bu = new JButton("버튼 테스트"); //버튼
	private JTextField tf = new JTextField(20); //문자열 입력 받는 항목(글자수)
	
	public SwingComFrame() {
		Container c = this.getContentPane();
		
		c.setLayout(new FlowLayout()); //배치방법 (일렬로 배치하다가 창의 크기를 넘으면 아래쪽으로 배치)
		c.add(la);
		c.add(bu);
		c.add(tf);
	}
}

public class SwingComFrameMain {
	public static void main(String[] args) {
		JFrame f = new SwingComFrame();
		f.setSize(300,150);
		f.setVisible(true); //f.show();는 비권장이므로 변경 //deprecation, 비추천메서드
	}

}
