package snake;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import util.FrameUtil;
import util.MyFrameFast;

public class GameFrame extends MyFrameFast {
	Square a = new Square(Color.red, height / 2, width / 2, 25, 25);
	Square b = new Square(Color.green, (int) (Math.random() * height), (int) (Math.random() * width), 25, 25);
	int time;

	public void paint(Graphics g) {
		g.fillRect(0, 0, 750, 750);
		a.draw(g);
		b.draw(g);
		if (a.getRect().intersects(b.getRect())) {
			b = new Square(Color.green, FrameUtil.random(100, height - 100), FrameUtil.random(100, width - 100), 25, 25);
			time++;
		}
	}

	private void printInfo(Graphics g, String str, int size, int x, int y, Color color) {
		g.setColor(color);
		g.setFont(new Font("Microsoft YaHei", Font.BOLD, size));
		g.drawString(str, x, y);
	}

	public static void main(String[] args) {
		new GameFrame().launchFrame();
	}

	public void launchFrame() {
		super.launchFrame();
		addKeyListener(new KeyMonitor());
	}

	class KeyMonitor extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			a.keyPressed(e);
		}

		public void keyReleased(KeyEvent e) {
			a.keyReleased(e);
		}
	}

}
