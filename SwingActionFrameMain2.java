package chapter28;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

//��Ӿ��� ������ĸ����� �ۼ�(������ ���α׷���)
public class SwingActionFrameMain2 implements ActionListener { 
	private JFrame f;
	private JButton b = new JButton("�����ϱ�");
	
	public SwingActionFrameMain2() {
		f = new JFrame("Event �׽�Ʈ");
		Container c = f.getContentPane();
		c.setLayout(new FlowLayout()); //��ġ��� (�Ϸķ� ��ġ�ϴٰ� â�� ũ�⸦ ������ �Ʒ������� ��ġ)
		c.add(b);
		
		b.addActionListener(this); //��ٸ��� �ִٰ� ���� �����ڰ� �ҷ�����
		f.setSize(300,100); //â�� ������ ����
		f.setVisible(true); //f.show();�� ������̹Ƿ� ����
	}
	
	public void actionPerformed(ActionEvent e) { //�̺�Ʈ�� �߻��ϸ� �ڵ� �����ϴ� �޼���
		System.exit(0); //����
	}
	//���θ޼���
	public static void main(String[] args) {
		new SwingActionFrameMain2();
	}

	

}
