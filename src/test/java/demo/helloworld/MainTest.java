package demo.helloworld;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MainTest extends Main {
	@Test
	public void test() {
		/* Junit test for HelloWorld */
		assertEquals("Hello! Have a splendid week ahead", Main.printOne()); 

		/* Success Junit test cases  */
		assertEquals("Output should be 30", 30, Main1.add(20, 10));
		assertEquals("Output should be 10", 10, Main2.sub(20, 10));

		// /* Failure Junit test cases */
		assertEquals("Output should be 30", 27, Main1.add(15, 12)); 
		assertEquals("Output should be 10", -10, Main2.sub(10,20 ));
		}
}
