package chapter28;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SwingActionFrame extends JFrame implements ActionListener{
	private JButton b = new JButton("종료하기");
	
	public SwingActionFrame() {
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout()); //배치방법 (일렬로 배치하다가 창의 크기를 넘으면 아래쪽으로 배치)
		c.add(b);
		
		b.addActionListener(this);//기다리고 있다가 현재 생성자가 불려지면
	}
	public void actionPerformed(ActionEvent e) { //이벤트가 발생하면 자동 실행하는 메서드
		System.exit(0); //종료
	}
}
//메인메서드
public class SwingActionFrameMain {
	public static void main(String[] args) {
		JFrame f = new SwingActionFrame();
		f.setSize(300,100); //창의 사이즈 조절
		f.setVisible(true); //f.show();는 비권장이므로 변경

	}

}
