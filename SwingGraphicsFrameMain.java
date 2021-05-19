package chapter29;

import java.awt.*;
import javax.swing.*;

class SwingGraphicsFrame extends JFrame{
	public SwingGraphicsFrame() {
		this.setTitle("Hello World");
	}
	public void paint(Graphics g) {
		//super.paint(g); 없으면 배경이 투명하다는데 나는 없어도 기본 배경이 잘보인다..
		g.drawString("Hello", 60, 60); //문자열을 좌표x, 좌표y위치에 출력
		g.drawOval(20, 80, 40, 40); //좌표x, 좌표y 위치에  너비, 길이의 원형
		g.drawLine(150, 140, 200, 250); //좌표x1, 좌표y1부터  좌표x2, 좌표y2까지의 선
		g.drawRect(300, 100, 50, 30); //좌표x, 좌표y위치에 너비, 길이의 사각형
		g.drawRoundRect(200, 50, 80, 50, 20, 20); //좌표x, 좌표y위치의 너비, 길이, 가로 곡선, 세로 곡선의 둥근사각형
	}
}

public class SwingGraphicsFrameMain {
	public static void main(String[] args) {
		//상 = 하
		JFrame f = new SwingGraphicsFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400,300);
		f.setVisible(true);
	}

}
