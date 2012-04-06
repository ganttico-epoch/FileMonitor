package file_monitor;

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
		/*
		 * try { Main.logger.setLevel(Level.parse(System
		 * .getProperty("FileMonitor.LOGLEVEL"))); } catch (Exception _) {
		 * Main.logger.setLevel(Level.ALL); }
		 */new Main(args);
		JOptionPane pane = new JOptionPane("Monitoring current folder...",
				JOptionPane.INFORMATION_MESSAGE);
		pane.setOptions(new String [] {"Cancel"});
		ImageIcon icon = new ImageIcon("icon.png");
		pane.setIcon(icon);
		
		JDialog dialog = pane.createDialog(null, "File Monitoring");
		dialog.setIconImage(icon.getImage());
		dialog.pack();
		dialog.setVisible(true);
		System.exit(0);
	}

}
