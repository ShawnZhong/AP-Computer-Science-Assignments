package curve;

import java.awt.Color;
import java.awt.Graphics;
import java.text.DecimalFormat;
import util.FrameUtil;
import util.MyFrameFast;

public class LissajousCurve extends MyFrameFast {
	public static int width = 750;
	public static int height = 750;

	final int B_A = 1;

	double a = 3;
	double delta = 0.025;

	public void paint(Graphics g) {
		g.fillRect(0, 0, 750, 750);
		g.setColor(Color.red);
		for (double i = 0; i <= 2 * Math.PI; i += 1 / 1000.0)
			g.fillOval((int) (300 * Math.sin(a * i)) + 375, (int) (300 * Math.cos((a + B_A) * i)) + 375, 7, 7);
		a += delta;
		if (a > 10 || a < -10)
			delta = -delta;

		FrameUtil.printInfo(g, "a = " + new DecimalFormat("0.000").format(a) + "      b = " + new DecimalFormat("0.000").format(a + B_A) + "      b - a = " + B_A, 20, 75, 60, Color.white);
	}

	public static void main(String[] args) {
		new LissajousCurve().launchFrame();
	}
}
