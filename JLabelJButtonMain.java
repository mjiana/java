package chapter28;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JLabelJButtonMain implements ActionListener {
	private JFrame f;
	private JLabel msn;
	private JButton imageb, textb, btnMemo;
	private ImageIcon image, smile;

	public JLabelJButtonMain() {
		f = new JFrame("�̹����� �߰��� ���̺�� ��ư");
		Container c = f.getContentPane();
		c.setLayout(new FlowLayout());

		image = new ImageIcon("./image/msn.png");
		smile = new ImageIcon("./image/smile.png");

		msn = new JLabel("MSN", image, JLabel.CENTER);
		imageb = new JButton(smile);
		imageb.setToolTipText("Ŭ�����ּ���");

		textb = new JButton("���û ����");
		textb.addActionListener(this);
		textb.setToolTipText("Ŭ�����ּ���");

		btnMemo = new JButton("�޸��� ����");
		btnMemo.addActionListener(this);
		btnMemo.setToolTipText("Ŭ�����ּ���");

		c.add(msn);
		c.add(imageb);
		c.add(textb);
		c.add(btnMemo);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(250, 200);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton jb = (JButton)e.getSource();

		System.out.println("jb"+jb);

		if(jb == textb) {
			try {
				Runtime rt = Runtime.getRuntime(); //Runtime : ������ ���α׷� ���� ��ü
				//Microsoft Edge������ ���� "exe ���" + " ���ͳ� Ȩ������ �ּ�"
				rt.exec("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe"
						+ " http://www.kma.go.kr");
			} catch (Exception ex) {
				System.out.println(ex.toString());
			}
		}
		if(jb == btnMemo) {
			try {
				Runtime rt = Runtime.getRuntime(); //Runtime : ������ ���α׷� ���� ��ü
				//�޸��� ������ ���� "exe ���"
				rt.exec("C:\\Windows\\system32\\notepad.exe");
			} catch (Exception ex) {
				System.out.println(ex.toString());
			}
		}
	}	
	//�����Լ�
	public static void main(String[] args) {
		//������ ȣ��
		new JLabelJButtonMain();
	}

}
