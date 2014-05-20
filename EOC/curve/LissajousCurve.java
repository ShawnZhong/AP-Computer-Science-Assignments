package curve;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;

public class LissajousCurve extends Frame {
	DecimalFormat f = new DecimalFormat("0.000");
	Font font = new Font("Microsoft YaHei", Font.BOLD, 20);
	Image image = null;
	Thread thread = new Thread() {
		public void run() {
			while (true) {
				repaint();
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};
	KeyAdapter keyListener = new KeyAdapter() {
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_LEFT:
				if (a > -10)
					a -= 0.025;
				break;
			case KeyEvent.VK_UP:
				if (difference < 10)
					difference += 0.025;
				break;
			case KeyEvent.VK_RIGHT:
				if (a < 10)
					a += 0.025;
				break;
			case KeyEvent.VK_DOWN:
				if (difference > -10)
					difference -= 0.025;
				break;
			case KeyEvent.VK_W:
				if (difference < 10)
					difference = (int) (difference + 1);
				break;
			case KeyEvent.VK_S:
				if (difference > -10)
					difference = (int) (difference - 1);
				break;
			case KeyEvent.VK_A:
				if (a > -10)
					a = (int) (a - 1);
				break;
			case KeyEvent.VK_D:
				if (a < 10)
					a = (int) (a + 1);
				break;
			case KeyEvent.VK_SPACE:
				auto = !auto;
			}
		}
	};

	double difference = 1;
	double a = 1;
	double delta = 0.025;
	boolean auto;

	public static void main(String[] args) {
		new LissajousCurve().launchFrame();
	}

	public void paint(Graphics g) {
		g.fillRect(0, 0, 750, 750);
		g.setColor(Color.red);
		for (double i = 0; i <= 2 * Math.PI; i += 0.0001)
			g.fillOval((int) (300 * Math.sin(a * i)) + 375, (int) (300 * Math.cos((a + difference) * i)) + 375, 7, 7);

		if (auto) {
			a += delta;
			if (a > 10 || a < -10)
				delta = -delta;
		}

		g.setColor(Color.white);
		g.setFont(font);
		g.drawString("a = " + f.format(a) + "      b = " + f.format(a + difference) + "      b - a = " + f.format(difference), 75, 60);
	}

	public void update(Graphics g) {
		if (image == null)
			image = this.createImage(750, 750);
		paint(image.getGraphics());
		g.drawImage(image, 0, 0, null);
	}

	public void launchFrame() {
		setSize(750, 750);
		setLocation(100, 100);
		setVisible(true);
		thread.start();
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		addKeyListener(keyListener);
	}
}
