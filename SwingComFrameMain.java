package chapter28;

import java.awt.*;
import javax.swing.*;

class SwingComFrame extends JFrame{
	private JLabel la = new JLabel("���̺� �׽�Ʈ"); //���ڿ� ���
	private JButton bu = new JButton("��ư �׽�Ʈ"); //��ư
	private JTextField tf = new JTextField(20); //���ڿ� �Է� �޴� �׸�(���ڼ�)
	
	public SwingComFrame() {
		Container c = this.getContentPane();
		
		c.setLayout(new FlowLayout()); //��ġ��� (�Ϸķ� ��ġ�ϴٰ� â�� ũ�⸦ ������ �Ʒ������� ��ġ)
		c.add(la);
		c.add(bu);
		c.add(tf);
	}
}

public class SwingComFrameMain {
	public static void main(String[] args) {
		JFrame f = new SwingComFrame();
		f.setSize(300,150);
		f.setVisible(true); //f.show();�� ������̹Ƿ� ���� //deprecation, ����õ�޼���
	}

}
