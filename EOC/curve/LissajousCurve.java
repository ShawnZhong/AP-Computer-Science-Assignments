package curve;

import java.awt.Color;
import java.awt.Graphics;
import util.MyFrame;

public class LissajousCurve extends MyFrame {
	public static int width = 750;
	public static int height = 750;

	double k = 2;
	int number = 1000;

	public void paint(Graphics g) {
		g.fillRect(0, 0, 750, 750);
		g.setColor(Color.red);
		for (double i = 0; i <= 2 * Math.PI; i += 1 / (double) number)
			g.fillOval((int) (300 * Math.sin(k * i)) + 375, (int) (300 * Math.cos((k + 1) * i)) + 375, 7, 7);
		k += 0.025;
		number++;
	}

	public static void main(String[] args) {
		new LissajousCurve().launchFrame();
	}

	public void launchFrame() {
		super.launchFrame();

	}
}
