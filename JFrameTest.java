package chapter28;

import javax.swing.*;

public class JFrameTest {
	private JFrame frame;
	
	public JFrameTest() {
		frame = new JFrame("JFrame"); //â�� �̸�
		frame.setSize(300, 200); //������
		frame.setVisible(true); //Ȱ��ȭ
	}

	public static void main(String[] args) {
		JFrameTest jt = new JFrameTest(); //â ����
	}

}
