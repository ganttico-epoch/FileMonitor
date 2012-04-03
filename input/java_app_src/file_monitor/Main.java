package file_monitor;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

	private static final Logger logger = Logger.getGlobal();

	public Main(String[] args) {
		super();
		Main.logger.info("Hello World !");
	}

	public static void main(String[] args) {
		try {
			Main.logger.setLevel(Level.parse(System
					.getProperty("FileMonitor.LOGLEVEL")));
		} catch (Exception _) {
			Main.logger.setLevel(Level.ALL);
		}
		new Main(args);
		System.exit(0);
	}

}
