package Day1;

//TODO : Build a window

// "awt" stands for Abstract Window Toolkit
// You'll use it later
import java.awt.Frame;

// I called it MyFrame, you can call it whatever you want
// You have to extend it to show the window
public class MyFrame extends Frame {
	public void launchFrame() {

		// set the size (in pixel) of your frame
		setSize(500, 500);

		// set the location (in pixel) of your frame
		setLocation(100, 100);

		// set visible to true
		setVisible(true);
	}
}
