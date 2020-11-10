package br.com.animati.ProjetoCalculadora;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class CalculatorTest {

	private Calculator calc;
	
	@Before
	private void init() {
		calc = new CalculatorImpl();
	}
		
	
	@Test
	public void sum() {
		int a = 3;
		int b = 2;
				
		assertEquals(5, calc.sum(a, b));
	}	
	
	@Test
	public void subtraction() {
		int a = 2;
		int b = 1;
		
		assertEquals(1, calc.subtraction(a, b));
		
	}

	@Test
	public void multiplication() {
		int a = 5;
		int b = 2;
		
		assertEquals(10, calc.multiplication(a, b));
	}
	
	@Test
	public void divison() throws Exception {
		int a = 10;
		int b = 5;
		
		assertEquals(2, calc.divison(a, b));
	}
	
	@Ignore
		@Test
		public void testEqual() {
			boolean result = calculator.equalIntegers(20, 20);
			
			assertTrue(result);
	}
}
