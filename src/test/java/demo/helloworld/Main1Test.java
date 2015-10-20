package demo.helloworld;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Main1Test extends Main {
	@Test
	public void test() {
		
		/* Failure Junit test cases */
		assertEquals("Output should be 30", 27, Main1.add(15, 12)); 
		}
}