package Day1;

// "awt" stands for Abstract Window Toolkit
// You'll use it later
import java.awt.Frame;

// I called it MyFrame, you can call it whatever you want
// You have to extend it to show the window
public class MyFrame extends Frame {
	public void launchFrame() {

		// set the size (in pixel) of your frame
		setSize(100, 100);

		// set the location (in pixel) of your frame
		setLocation(0, 0);

		// set visible
		setVisible(false);

		// uncomment these code below so that you are able to close your window

		/*
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		*/
	}
}
