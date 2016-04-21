package homework.builder;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProfileTest {
	private Profile profile;
	@Before
	public void setUp() throws Exception {
		profile = new Profile.Builder()
		.field1("1")
		.field3("3")
		.field2("2")
		.field4("4")
		.build();
	}

	@Test
	public void testToString() {
		assertEquals("Profile{field1='1', field2='2', field3='3', field4='4'}",profile.toString());
	}
}