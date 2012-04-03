package file_monitor;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import static org.junit.Assert.*;

public class MainTest {

	@Test
	public void checkJunitIsWorking() {
		assertEquals(true, true);
	}

	@Ignore
	@Test
	public void IgnoredFalingTest() {
		assertFalse(true);
	}

	public static void main(String[] args) {
		JUnitCore.main("file_monitor.MainTest");
	}

}
