package chapter29;

import java.awt.*;
import javax.swing.*;

class SwingGraphicsFrame extends JFrame{
	public SwingGraphicsFrame() {
		this.setTitle("Hello World");
	}
	public void paint(Graphics g) {
		//super.paint(g); ������ ����� �����ϴٴµ� ���� ��� �⺻ ����� �ߺ��δ�..
		g.drawString("Hello", 60, 60); //���ڿ��� ��ǥx, ��ǥy��ġ�� ���
		g.drawOval(20, 80, 40, 40); //��ǥx, ��ǥy ��ġ��  �ʺ�, ������ ����
		g.drawLine(150, 140, 200, 250); //��ǥx1, ��ǥy1����  ��ǥx2, ��ǥy2������ ��
		g.drawRect(300, 100, 50, 30); //��ǥx, ��ǥy��ġ�� �ʺ�, ������ �簢��
		g.drawRoundRect(200, 50, 80, 50, 20, 20); //��ǥx, ��ǥy��ġ�� �ʺ�, ����, ���� �, ���� ��� �ձٻ簢��
	}
}

public class SwingGraphicsFrameMain {
	public static void main(String[] args) {
		//�� = ��
		JFrame f = new SwingGraphicsFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400,300);
		f.setVisible(true);
	}

}
