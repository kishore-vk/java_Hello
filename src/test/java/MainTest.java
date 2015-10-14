package demo.helloworld;

import static org.junit.Assert. * ;

import org.junit.Test;

public class MainTest {

	 @ Test
	public void test() {
		assertEquals("Hello World", Main.printOne());
		assertEquals("Output should be 11", 11, Main.add());

	}

}