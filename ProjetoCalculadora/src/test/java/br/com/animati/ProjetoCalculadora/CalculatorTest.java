package br.com.animati.ProjetoCalculadora;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	
	
	
	@Test
	public void sum() {
		CalculatorImpl calc = new CalculatorImpl();
		int a = 2;
		int b = 2;
		
		assertEquals(4, calc.sum(a, b));
	}

//	int subtraction(int a, int b);
//
//	int multiplication(int a, int b);
//
//	int divison(int a, int b) throws Exception;
//
//	boolean equalIntegers(int a, int b);
//	
//	
}
