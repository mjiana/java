package chapter28;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame implements ActionListener {
	JPanel panel1, panel2;
	JTextField id;
	JPasswordField pw;
	JButton confirm, cancel;
	
	public LoginForm() {
		panel1 = new JPanel();
		panel1.setLayout(new GridLayout(2,2));
		
		id = new JTextField(10);
		pw = new JPasswordField(10);
		
		panel1.add(new JLabel("���̵�",JLabel.LEFT));
		panel1.add(id);
		id.setToolTipText("ID�� �Է��ϼ���");
		
		panel1.add(new JLabel("��й�ȣ",JLabel.LEFT));
		panel1.add(pw);
		pw.setToolTipText("PW�� �Է��ϼ���");
		
		panel2 = new JPanel();
		confirm = new JButton("Ȯ��");
		cancel = new JButton("���");
		
		confirm.addActionListener(this);
		cancel.addActionListener(this);
		panel2.add(confirm);
		panel2.add(cancel);
		
		getContentPane().add(panel1, "Center"); //ù���� �빮��, ��ҹ��� ����
		getContentPane().add(panel2, "South"); //ù���� �빮��, ��ҹ��� ����
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(200,120);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		String db_id = "1";
		String db_pw = "1";
		String password = String.valueOf(pw.getPassword());
		
		if( o == confirm) {
			//if(db_id.equals(id.getText().trim()) && db_pw.equals(password.trim())) {
			if(db_id.equals(id.getText().trim()) && db_pw.equals(password.trim())) {
				id.setText("Success");
				System.out.println(pw.getPassword());
				System.out.println(db_pw);
				System.out.println(password);
				pw.setText("");
			}else {
				id.setText("Fail");
				pw.setText("");
				id.requestFocus(); //Ű���� ��Ŀ��
			}
		}else if( o == cancel) {
			id.setText(""); //empty
			pw.setText("");
			id.requestFocus(); //Ű���� ��Ŀ��
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LoginForm();
	}

}
