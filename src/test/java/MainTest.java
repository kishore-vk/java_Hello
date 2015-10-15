package demo.helloworld;

import static org.junit.Assert. * ;

import org.junit.Test;

public class MainTest {

	 @ Test
	public void test() {
		assertEquals("Hello! Manoj & Arif", Main.printOne());
		assertEquals("Output should be 12", 14, Main.add());

	}

}