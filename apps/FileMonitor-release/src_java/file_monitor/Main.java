package file_monitor;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	public static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

	public Main(String[] args) {
		super();
		Main.LOGGER.info("Hello World!");
	}

	public static void main(String[] args) {
		new Main(args);
		JOptionPane pane = new JOptionPane("Monitoring current folder...",
				JOptionPane.INFORMATION_MESSAGE);
		pane.setOptions(new String[] { "Cancel" });

		URL url = ClassLoader.getSystemClassLoader().getResource("icon.png");
		ImageIcon icon = new ImageIcon(url);

		pane.setIcon(icon);

		JDialog dialog = pane.createDialog(null, "File Monitoring");
		dialog.setIconImage(icon.getImage());
		dialog.pack();
		dialog.setVisible(true);
		System.exit(0);
	}

}
