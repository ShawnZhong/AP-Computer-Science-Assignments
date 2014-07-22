package util;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrameFast extends Frame {
	public static int width = 750;
	public static int height = 750;

	public void launchFrame() {
		setSize(width, height);
		setLocation(100, 100);
		setVisible(true);

		new PaintThread().start();

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	private Image offScreenImage = null;

	public void update(Graphics g) {
		if (offScreenImage == null)
			offScreenImage = this.createImage(width, height);

		Graphics gOff = offScreenImage.getGraphics();

		paint(gOff);
		g.drawImage(offScreenImage, 0, 0, null);
	}

	class PaintThread extends Thread {
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
	}

}
