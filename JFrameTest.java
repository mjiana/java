package chapter28;

import javax.swing.*;

public class JFrameTest {
	private JFrame frame;
	
	public JFrameTest() {
		frame = new JFrame("JFrame"); //창의 이름
		frame.setSize(300, 200); //사이즈
		frame.setVisible(true); //활성화
	}

	public static void main(String[] args) {
		JFrameTest jt = new JFrameTest(); //창 열림
	}

}
