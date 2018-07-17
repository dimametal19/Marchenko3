package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.NameInConsole;

public class NameInConsoleTest {

	@Test
	public void testMain() {
		NameInConsole.main(new String[] {});
		Assert.assertEquals("Dmitry Marchenko", "Dmitry Marchenko");
	}

}
