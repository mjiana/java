package chapter28;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JTextAreaTest implements ActionListener{
	private JFrame f;
	private JButton btnOk;
	private JTextArea jta;
	private JScrollPane jcp;
	private JViewport vp;
	
	
	public JTextAreaTest() {
		jcp = new JScrollPane();
		vp = jcp.getViewport();
		f = new JFrame("TextArea");
		Container c = f.getContentPane();
		c.setLayout(new FlowLayout());
		
		btnOk = new JButton("Ȯ��");
		btnOk.addActionListener(this);
		c.add(btnOk);
		
		jta = new JTextArea(6, 30);
		jta.setFont(new Font("�ü�ü", Font.BOLD, 12));
		jta.setText("JtextArea ����");
		jta.setLineWrap(true);
		vp.add(new JScrollPane(jta));
		c.add(vp);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(250, 180);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton jb = (JButton)e.getSource();
		
		if( jb == btnOk) {
			try {
				StringBuffer s = new StringBuffer();
				
				s.append("5��  ���Դϴ�.");
				s.append("5��  java�����Դϴ�.");
				s.append("5��  ���Դϴ�.");
				s.append("5��  java�����Դϴ�.");
				s.append("5��  ���Դϴ�.");
				s.append("5��  java�����Դϴ�.");
				s.append("5��  ���Դϴ�.");
				s.append("5��  java�����Դϴ�.");
				s.append("5��  ���Դϴ�.");
				s.append("5��  java�����Դϴ�.");
				s.append("5��  ���Դϴ�.");
				s.append("5��  java�����Դϴ�.");
				
				jta.setText(s.toString());
				jta.append("==================");
				jta.append("==================");
			} catch (Exception ex) {
				System.out.println(ex.toString());
			}
		}
	}
}

public class JTextAreaMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JTextAreaTest();
}

}
