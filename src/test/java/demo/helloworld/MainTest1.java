package demo.helloworld;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MainTest1 extends Main {
	@Test
	public void test() {
		
		/* Failure Junit test cases */
		assertEquals("Output should be 30", 27, Main1.add(15, 12)); 
		assertEquals("Output should be 10", -10, Main2.sub(10,20 ));
		}
}