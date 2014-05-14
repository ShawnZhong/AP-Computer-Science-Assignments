package plane;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import util.GameUtil;
import util.MyFrame;

public class Plane {
	private Image img;
	private double x, y;
	private int width, height, speed;

	private boolean left, up, right, down;
	private boolean live = true;

	public Plane(String imgpath, int x, int y, int speed) {
		this.speed = speed;
		this.img = GameUtil.getImage(imgpath);
		this.width = img.getWidth(null);
		this.height = img.getHeight(null);
		this.x = x;
		this.y = y;

	}

	public void draw(Graphics g) {
		g.drawImage(img, (int) x, (int) y, null);
		g.setColor(Color.red);
		g.drawRect((int) x + height / 3, (int) y + width / 3, width / 3, height / 3);
		move();
	}

	public Rectangle getRect() {
		return new Rectangle((int) x + height / 3, (int) y + width / 3, width / 3, height / 3);
	}

	public void move() {
		if (left && x > 0)
			x -= speed;
		if (right && x < MyFrame.GAME_HEIGHT - height)
			x += speed;
		if (up && y > width / 2)
			y -= speed;
		if (down && y < MyFrame.GAME_WIDTH - width)
			y += speed;
	}

	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			left = true;
			break;
		case KeyEvent.VK_UP:
			up = true;
			break;
		case KeyEvent.VK_RIGHT:
			right = true;
			break;
		case KeyEvent.VK_DOWN:
			down = true;
			break;
		}
	}

	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			left = false;
			break;
		case KeyEvent.VK_UP:
			up = false;
			break;
		case KeyEvent.VK_RIGHT:
			right = false;
			break;
		case KeyEvent.VK_DOWN:
			down = false;
			break;
		}
	}

	public boolean isLive() {
		return live;
	}

	public void setLive(boolean live) {
		this.live = live;
	}
}
