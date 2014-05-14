package plane;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import util.FrameUtil;
import util.MyFrame;

public class GameFrame extends MyFrame {
	final int BULLET_NUMBER = 50;
	boolean alive = true;

	Plane p = new Plane(FrameUtil.getImage("plane/plane.png"), 50, 50, 10);
	ArrayList<Bullet> bulletList = new ArrayList<Bullet>(BULLET_NUMBER);
	long start, period;

	public void paint(Graphics g) {
		g.drawImage(FrameUtil.getImage("plane/bg.jpg"), 0, 0, null);
		if (alive)
			p.draw(g);
		else
			FrameUtil.printInfo(g, "Time : " + period + "s", 20, height / 2 - 50, width / 2, Color.white);

		for (Bullet b : bulletList) {
			b.draw(g);
			if (b.getRect().intersects(p.getRect()) && alive) {
				alive = false;
				period = (new Date().getTime() - start) / 1000;
			}
		}
	}

	public static void main(String[] args) {
		new GameFrame().launchFrame();
	}

	public void launchFrame() {
		super.launchFrame();
		addKeyListener(new KeyMonitor());

		for (int i = 0; i < BULLET_NUMBER; i++)
			bulletList.add(new Bullet(10, 10, 3));

		start = new Date().getTime();
	}

	class KeyMonitor extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			p.keyPressed(e);
		}

		public void keyReleased(KeyEvent e) {
			p.keyReleased(e);
		}
	}

}
