package chapter28;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Ŭ������ ��ӹ��� �ʰ� �������̽� ��������
class SwingWindowFrame implements ActionListener, WindowListener{
	private JFrame f; //���� �Ǿ��ִ� ����
	private JButton b;
	
	public SwingWindowFrame() { //�����ڰ� ȣ��Ǿ��� �� 
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
	//WindowListner�� �߻�޼������ ���� �� ������ �ؾ������� �ʿ���� ������ {}�� ó��
	public void windowActivated(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {} //���� �Ŀ� ó��
	public void windowDeactivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}
	
	public void windowClosing(WindowEvent e) { //������ �߿�
		System.exit(0);
	}
	//�̺�Ʈ �ڵ� ����, ActionListener�� �߻�޼���
	public void actionPerformed(ActionEvent e) {
		f.setTitle("�׼Ǹ����ʿ� �����츮����");
	}
}
//�����Լ�
public class SwingWindowFrameMain {
	public static void main(String[] args) {
		//������ ȣ��
		new SwingWindowFrame();
	}

}
