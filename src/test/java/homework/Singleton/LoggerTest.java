package homework.singleton;

import org.junit.Test;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;

public class LoggerTest {
	private Logger logger = Logger.getInstance();

	@Test
	public void testGetInstance() {
		assertTrue(logger == Logger.getInstance());
	}

	@Test
	public void testSerialize() throws IOException, ClassNotFoundException {
		ObjectOutput out=new ObjectOutputStream(new FileOutputStream("src/test/resources/file.ser"));
		out.writeObject(logger);
		out.close();
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("src/test/resources/file.ser"));
		Logger serializedLogger= (Logger) in.readObject();
		in.close();
		assertTrue(serializedLogger == Logger.getInstance());


	}

	@Test
	public void testReflation() throws IllegalAccessException, InvocationTargetException, InstantiationException {
		Logger log = null;
		Constructor[] constructors = Logger.class.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			constructor.setAccessible(true);
			log = (Logger) constructor.newInstance();
			assertTrue(log == Logger.getInstance());
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