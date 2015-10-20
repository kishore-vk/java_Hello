package demo.helloworld;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Main2Test extends Main {
	@Test
	public void test() {
		
		/* Failure Junit test cases */
		assertEquals("Output should be 10", -87, Main2.sub(10,20 ));
		}
}