package plane;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class PlaneGameFrame extends MyFrame {
	final int BULLET_NUMBER = 20;

	Plane p = new Plane(getImage("plane/plane.png"), 50, 50, 10);
	ArrayList<Bullet> bulletList = new ArrayList<Bullet>(BULLET_NUMBER);
	long start, period;

	public void paint(Graphics g) {
		g.drawImage(getImage("plane/bg.jpg"), 0, 0, null);
		if (p.isLive())
			p.draw(g);
		else
			printInfo(g, "Time : " + period + "s", 20, 190, 270, Color.white);

		for (Bullet b : bulletList) {
			b.draw(g);
			if (b.getRect().intersects(p.getRect()) && p.isLive()) {
				p.setLive(false);
				period = (new Date().getTime() - start) / 1000;
			}
		}
	}

	public void printInfo(Graphics g, String str, int size, int x, int y, Color color) {
		g.setColor(color);
		g.setFont(new Font("Microsoft YaHei", Font.BOLD, size));
		g.drawString(str, x, y);
	}

	public static void main(String[] args) {
		new PlaneGameFrame().launchFrame();
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

	public static Image getImage(String path) {
		try {
			return javax.imageio.ImageIO.read(PlaneGameFrame.class.getClassLoader().getResource(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
