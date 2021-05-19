package chapter28;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

//상속없이 참조방식만으로 작성(유연한 프로그래밍)
public class SwingActionFrameMain2 implements ActionListener { 
	private JFrame f;
	private JButton b = new JButton("종료하기");
	
	public SwingActionFrameMain2() {
		f = new JFrame("Event 테스트");
		Container c = f.getContentPane();
		c.setLayout(new FlowLayout()); //배치방법 (일렬로 배치하다가 창의 크기를 넘으면 아래쪽으로 배치)
		c.add(b);
		
		b.addActionListener(this); //기다리고 있다가 현재 생성자가 불려지면
		f.setSize(300,100); //창의 사이즈 조절
		f.setVisible(true); //f.show();는 비권장이므로 변경
	}
	
	public void actionPerformed(ActionEvent e) { //이벤트가 발생하면 자동 실행하는 메서드
		System.exit(0); //종료
	}
	//메인메서드
	public static void main(String[] args) {
		new SwingActionFrameMain2();
	}

	

}
