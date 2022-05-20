package compute;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void testMultiply_for_0() {
		
		Calculator calculator = new Calculator();
		double result = calculator.compute(3.2, 1.5, "*");
		Assert.assertEquals(4.8, result, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testInvalidOperator() {
	Calculator calculator = new Calculator();
	calculator .compute(10, -5, "+");
	
	}
}
