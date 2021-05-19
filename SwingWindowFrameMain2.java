package chapter28;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//WindowAdapter�� ��ӹް� ActionListner �������̽� ����
class SwingWindowFrame2 extends WindowAdapter implements ActionListener{
	private JFrame f; //���� �Ǿ��ִ� ����
	private JButton b;
	
	public SwingWindowFrame2() { //�����ڰ� ȣ��Ǿ��� �� 
		f = new JFrame("Window Event Test"); //�޸� �Ҵ�
		b = new JButton("���� �ٲٱ�");
		Container c = f.getContentPane();
		
		c.setLayout(new FlowLayout()); //��ġ��� : �Ϸ�
		c.add(b); //�߰�(���̱�)
		
		b.addActionListener(this); //��ư�� �׼Ǹ����� ����
		f.addWindowListener(this); //�����ӿ� �����츮���� ����
		
		f.setSize(300, 100); //â ������ ����
		f.setVisible(true); //������ ������ ����
	}
	
	//�������̽��� ����(implements)�޾Ҵٸ� ��� �߻�޼��带 ������ �ؾ�������
	//WindowAdapter�� WindowListner�� ����Ŭ�����̹Ƿ� 
	//���(extends)�޴� Ŭ������ �ʿ��� �޼��常 �������ϸ� �ȴ�.
	public void windowClosing(WindowEvent e) { //������ �߿� ó���� �̺�Ʈ
		System.exit(0);
	}
	//�̺�Ʈ �ڵ� ����, ActionListener�� �߻�޼���
	public void actionPerformed(ActionEvent e) {
		f.setTitle("�׼Ǹ����ʿ� �����츮����");
	}
}
//�����Լ�
public class SwingWindowFrameMain2 {
	public static void main(String[] args) {
		//������ ȣ��
		new SwingWindowFrame2();
	}

}
