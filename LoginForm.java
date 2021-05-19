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
		
		panel1.add(new JLabel("아이디",JLabel.LEFT));
		panel1.add(id);
		id.setToolTipText("ID를 입력하세요");
		
		panel1.add(new JLabel("비밀번호",JLabel.LEFT));
		panel1.add(pw);
		pw.setToolTipText("PW를 입력하세요");
		
		panel2 = new JPanel();
		confirm = new JButton("확인");
		cancel = new JButton("취소");
		
		confirm.addActionListener(this);
		cancel.addActionListener(this);
		panel2.add(confirm);
		panel2.add(cancel);
		
		getContentPane().add(panel1, "Center"); //첫글자 대문자, 대소문자 가림
		getContentPane().add(panel2, "South"); //첫글자 대문자, 대소문자 가림
		
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
				id.requestFocus(); //키보드 포커스
			}
		}else if( o == cancel) {
			id.setText(""); //empty
			pw.setText("");
			id.requestFocus(); //키보드 포커스
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LoginForm();
	}

}
