package curve;

import java.awt.Color;
import java.awt.Graphics;
import java.text.DecimalFormat;
import util.FrameUtil;
import util.MyFrameFast;

public class LissajousCurve extends MyFrameFast {
	public static int width = 750;
	public static int height = 750;

	double n = 3;
	double delta = 0.025;
	int number = 1000;

	public void paint(Graphics g) {
		g.fillRect(0, 0, 750, 750);
		g.setColor(Color.red);
		for (double i = 0; i <= 2 * Math.PI; i += 1 / (double) number)
			g.fillOval((int) (300 * Math.sin(n * i)) + 375, (int) (300 * Math.cos((n + 1) * i)) + 375, 7, 7);
		n += delta;
		if (n > 10 || n < -10)
			delta = -delta;
		number++;

		FrameUtil.printInfo(g, "n = " + new DecimalFormat("0.000").format(n), 20, 75, 60, Color.white);
	}

	public static void main(String[] args) {
		new LissajousCurve().launchFrame();
	}

	public void launchFrame() {
		super.launchFrame();

	}
}
