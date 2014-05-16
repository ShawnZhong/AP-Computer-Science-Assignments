package squares;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import util.MyFrame;

public class Square {
	private int x, y, height, width;
	private boolean left, up, right, down;
	private Color color;

	private final int SPEED = 10;

	public Square(Color color, int x, int y, int height, int width) {
		this.color = color;
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
	}

	public void draw(Graphics g) {
		g.setColor(color);
		g.fillRect(x, y, width, height);
	}

	public void move() {
		if (left && x > 0)
			x -= SPEED;
		if (right && x < MyFrame.height - height - 10)
			x += SPEED;
		if (up && y > width / 2 + 30)
			y -= SPEED;
		if (down && y < MyFrame.width - width - 10)
			y += SPEED;
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

	public boolean intersects(Square s) {
		int tx = this.x;
		int ty = this.y;
		int rx = s.x;
		int ry = s.y;

		return ((width + rx > tx) && (height + ry > ty) && (width + tx > rx) && (height + ty > ry));
	}
}
