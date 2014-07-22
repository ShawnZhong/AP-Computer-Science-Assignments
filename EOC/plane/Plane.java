package plane;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import util.MyFrame;

public class Plane {
	private Image img;
	private Rectangle rect;
	private double x, y;
	private int width, height, speed;
	private boolean left, up, right, down;

	public Plane(Image img, int x, int y, int speed) {
		this.img = img;
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.width = img.getWidth(null);
		this.height = img.getHeight(null);
		this.rect = new Rectangle((int) x + height / 3, (int) y + width / 3, width / 3, height / 3);
	}

	public void draw(Graphics g) {
		g.drawImage(img, (int) x, (int) y, null);
		g.setColor(Color.red);
		g.drawRect(rect.x, rect.y, rect.width, rect.height);
		move();
	}

	public void move() {
		if (left && x > 0)
			x -= speed;
		if (right && x < MyFrame.height - height)
			x += speed;
		if (up && y > width / 2)
			y -= speed;
		if (down && y < MyFrame.width - width)
			y += speed;
		rect = new Rectangle((int) x + height / 3, (int) y + width / 3, width / 3, height / 3);
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

	public Rectangle getRect() {
		return rect;
	}

}
