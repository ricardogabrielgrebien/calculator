package ch.bbw.rg.calc;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	Calculator testee;
	
	@Test
	public void testSummeZweiPositiveIsOk() {
		testee = new Calculator();
		assertTrue(testee.summe(10, 25) == 35);
	}
	
	@Test
	public void testSubstracionZweiPositiveIsOk(){
		testee = new Calculator();
		assertTrue(testee.minus(25,10) == 15);
	}
	
	@Test
	public void testMalZweiPositiveIsOk() {
		testee = new Calculator();
		assertTrue(testee.summe(10, 25) == 35);
	}
	
	@Test
	public void testGeteiltZweiPositiveIsOk(){
		testee = new Calculator();
		assertTrue(testee.minus(25,10) == 15);
	}

}
