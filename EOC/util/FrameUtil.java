package util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import plane.GameFrame;

public class FrameUtil {
	public static void printInfo(Graphics g, String str, int size, int x, int y, Color color) {
		g.setColor(color);
		g.setFont(new Font("Microsoft YaHei", Font.BOLD, size));
		g.drawString(str, x, y);
	}

	public static Image getImage(String path) {
		try {
			return javax.imageio.ImageIO.read(GameFrame.class.getClassLoader().getResource(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static int random(int low, int high) {
		return (int) (Math.random() * (high - low + 1) + low);
	}
}
