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
		f = new JFrame("이미지가 추가된 레이블과 버튼");
		Container c = f.getContentPane();
		c.setLayout(new FlowLayout());

		image = new ImageIcon("./image/msn.png");
		smile = new ImageIcon("./image/smile.png");

		msn = new JLabel("MSN", image, JLabel.CENTER);
		imageb = new JButton(smile);
		imageb.setToolTipText("클릭해주세요");

		textb = new JButton("기상청 접속");
		textb.addActionListener(this);
		textb.setToolTipText("클릭해주세요");

		btnMemo = new JButton("메모장 열기");
		btnMemo.addActionListener(this);
		btnMemo.setToolTipText("클릭해주세요");

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
				Runtime rt = Runtime.getRuntime(); //Runtime : 윈도우 프로그램 실행 객체
				//Microsoft Edge실행을 위해 "exe 경로" + " 인터넷 홈페이지 주소"
				rt.exec("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe"
						+ " http://www.kma.go.kr");
			} catch (Exception ex) {
				System.out.println(ex.toString());
			}
		}
		if(jb == btnMemo) {
			try {
				Runtime rt = Runtime.getRuntime(); //Runtime : 윈도우 프로그램 실행 객체
				//메모장 실행을 위해 "exe 경로"
				rt.exec("C:\\Windows\\system32\\notepad.exe");
			} catch (Exception ex) {
				System.out.println(ex.toString());
			}
		}
	}	
	//메인함수
	public static void main(String[] args) {
		//생성자 호출
		new JLabelJButtonMain();
	}

}
