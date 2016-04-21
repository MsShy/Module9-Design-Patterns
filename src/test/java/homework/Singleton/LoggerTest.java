package homework.singleton;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;

public class LoggerTest {
	Logger logger = Logger.getInstance();

	@Test
	public void testGetInstance() {
		assertTrue(logger == Logger.getInstance());
	}

	@Test
	public void testSerialize() {

	}

	@Test
	public void testReflation() {
		Constructor[] constructors = Logger.class.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			constructor.setAccessible(true);
			assertTrue(logger == Logger.getInstance());
		}
	}

	@Test(expected = IllegalStateException.class)
	public void testClone() throws CloneNotSupportedException {
		logger.clone();
	}

	@Test
	public void testMessage() {
		logger.message("message");
		assertFalse(logger.print().isEmpty());
	}

	@Test
	public void testPrint() {
		assertTrue(logger.print().isEmpty());
	}
	
}