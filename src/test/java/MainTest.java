package demo.helloworld;

import static org.junit.Assert. * ;

import org.junit.Test;

public class MainTest {

	 @ Test
	public void test() {
		assertEquals("Hello! Have a great weekend", Main.printOne());
		assertEquals("Output should be 14", 14, Main.add());
		assertEquals("Output should be 2", 2, Main.sub()");
	}

}