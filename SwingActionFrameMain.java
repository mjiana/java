package chapter28;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SwingActionFrame extends JFrame implements ActionListener{
	private JButton b = new JButton("�����ϱ�");
	
	public SwingActionFrame() {
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout()); //��ġ��� (�Ϸķ� ��ġ�ϴٰ� â�� ũ�⸦ ������ �Ʒ������� ��ġ)
		c.add(b);
		
		b.addActionListener(this);//��ٸ��� �ִٰ� ���� �����ڰ� �ҷ�����
	}
	public void actionPerformed(ActionEvent e) { //�̺�Ʈ�� �߻��ϸ� �ڵ� �����ϴ� �޼���
		System.exit(0); //����
	}
}
//���θ޼���
public class SwingActionFrameMain {
	public static void main(String[] args) {
		JFrame f = new SwingActionFrame();
		f.setSize(300,100); //â�� ������ ����
		f.setVisible(true); //f.show();�� ������̹Ƿ� ����

	}

}
