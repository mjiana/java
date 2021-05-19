package chapter29;

import java.awt.*;
import javax.swing.*;

class SwingShapeFrame extends JFrame{
	public SwingShapeFrame() {
		this.setTitle("Draw Shape");
	}
	public void paint(Graphics g) {
		//super.paint(g); 없으면 배경이 투명하다는데 나는 없어도 기본 배경이 잘보인다..
		g.setColor(Color.black);
		g.fillRect(0, 0, 500, 500);
		g.drawString("Draw", 20, 50);
		g.setColor(Color.blue);
		g.drawOval(50, 60, 30, 30);
		g.setColor(Color.red);
		g.drawLine(80, 80, 100, 100);
		g.setColor(Color.cyan);
		g.drawRect(70, 100, 50, 50);
		g.setColor(Color.darkGray);
		g.fillRect(100, 120, 50, 50);
	}
}

public class SwingShapeFrameMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new SwingShapeFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(200,200);
		f.setVisible(true);
	}

}
