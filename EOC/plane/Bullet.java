package plane;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import util.MyFrame;

public class Bullet {
	private double x, y, degree;
	private int width, height, speed;

	public Bullet(int width, int height, int speed) {
		this.x = MyFrame.GAME_WIDTH / 2;
		this.y = MyFrame.GAME_WIDTH / 2;
		this.speed = speed;
		this.width = width;
		this.height = height;
		degree = Math.random() * Math.PI * 2;
	}

	public void draw(Graphics g) {
		g.setColor(Color.yellow);
		g.fillOval((int) x, (int) y, width, height);

		x += speed * Math.cos(degree);
		y += speed * Math.sin(degree);

		if (y > MyFrame.GAME_HEIGHT - height || y < 30)
			degree = -degree;
		if (x < 0 || x > MyFrame.GAME_WIDTH - width)
			degree = Math.PI - degree;
	}

	public Rectangle getRect() {
		return new Rectangle((int) x, (int) y, width, height);
	}
}
