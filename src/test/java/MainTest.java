package demo.helloworld;

import static org.junit.Assert. * ;

import org.junit.Test;

public class MainTest {

	 @ Test
	public void test() {
		assertEquals("Hello! Good day", Main.printOne());
		assertEquals("Output should be 12", 12, Main.add());

	}

}