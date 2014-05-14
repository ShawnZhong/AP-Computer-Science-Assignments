package snake;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import util.FrameUtil;
import util.MyFrameFast;

public class GameFrame extends MyFrameFast {
	Square a = new Square(Color.red, height / 2, width / 2, 25, 25);
	Square b = new Square(Color.green, FrameUtil.random(50, height - 50), FrameUtil.random(50, width - 50), 25, 25);
	int score;

	public void paint(Graphics g) {
		g.fillRect(0, 0, 750, 750);
		a.draw(g);
		b.draw(g);
		if (a.getRect().intersects(b.getRect())) {
			b = new Square(Color.green, FrameUtil.random(50, height - 50), FrameUtil.random(50, width - 50), 25, 25);
			score++;
		}
		FrameUtil.printInfo(g, "Score : " + score, 25, 100, 100, Color.white);
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
