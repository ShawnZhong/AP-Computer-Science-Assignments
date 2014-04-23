

import java.awt.HeadlessException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MessageDialog {

	public static void main(String[] args) throws HeadlessException,
			MalformedURLException {
		JOptionPane.showMessageDialog(null, "Hello", "Title", 0, new ImageIcon(
				new URL("http://horstmann.com/java4everyone/duke.gif")));
	}

}
