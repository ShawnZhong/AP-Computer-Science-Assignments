package snake;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import util.MyFrame;

public class GameFrame extends MyFrame {
	Square a = new Square(Color.red, height / 2, width / 2, 25, 25);
	Square b = new Square(Color.green, (int) (Math.random() * height), (int) (Math.random() * width), 25, 25);

	public void paint(Graphics g) {
		g.fillRect(0, 0, 750, 750);
		a.draw(g);
		b.draw(g);
		if (a.getRect().intersects(b.getRect())) {
			b = new Square(Color.green, random(50, height - 50), random(50, width - 50), 25, 25);
		}
	}

	private int random(int low, int high) {
		return (int) (Math.random() * (high - low + 1) + low);
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
