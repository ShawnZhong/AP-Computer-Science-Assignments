package snake;

import java.awt.Graphics;
import util.MyFrame;

public class GameFrame extends MyFrame {
	double k = 2;
	int number = 1000;

	public void paint(Graphics g) {
		g.fillRect(0, 0, 750, 750);

	}

	public static void main(String[] args) {
		new GameFrame().launchFrame();
	}

	public void launchFrame() {
		super.launchFrame();

	}
}
