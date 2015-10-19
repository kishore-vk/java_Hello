package demo.helloworld;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MainTest extends Main {
	 @ Test
	public void test() {
		assertEquals("Hello! Have a great weekend", Main.printOne());
		assertEquals("Output should be 30", 30, Main1.add(20, 10));
		assertEquals("Output should be 10", 10, Main2.sub(20,10 ));
		assertEquals("Output should be 30", 40, Main1.add(20, 10));
		assertEquals("Output should be 10", 10, Main2.sub(10,20 ));
	}

	}
