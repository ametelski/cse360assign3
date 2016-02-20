package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Junit test for Calculator class
 * 
 * @author Adam Metelsk pin number 605 
 * @version 2016.02.20
 *
 */
public class CalculatorTest {

	@Test
	public void test_Calculator() {
		Calculator test = new Calculator(); 
		
		assertNotNull(test); 
	}
	
	@Test
	public void test_getTotal() {
		Calculator test = new Calculator(); 
		
		assertEquals(0, test.getTotal());
	}
	
	@Test
	public void test_add() {
		Calculator test = new Calculator(); 
		test.add(2);
		
		assertEquals(2, test.getTotal()); 
	}
	
	@Test
	public void test_subtract() {
		Calculator test = new Calculator(); 
		test.add(4);
		test.subtract(2);
		
		assertEquals(2, test.getTotal());
	}
	
	@Test
	public void test_multipy() {
		Calculator test = new Calculator(); 
		test.add(4);
		test.multiply(4);
		
		assertEquals(16, test.getTotal());
	}
	
	@Test
	public void test_divde() {
		Calculator test = new Calculator(); 
		test.add(10);
		test.divide(2);
		
		assertEquals(5, test.getTotal());
	}
	
	@Test
	public void test_divde_by_zero() {
		Calculator test = new Calculator(); 
		test.add(4);
		test.divide(0);
		
		assertEquals(0, test.getTotal());
	}
	
	
	@Test
	public void test_getHistory() {
		Calculator test = new Calculator();
		
		assertEquals("",test.getHistory());
	}

	
}
