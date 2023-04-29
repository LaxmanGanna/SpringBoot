package com.ciq.test;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculationTesting {
	
	
	Calculator c1=new Calculator();
	@Test
	public void test1() {
		int a=10;
		int b=10;
		int actual=c1.sum(a, b);
		int expecedResult=20;
		
		assertEquals(actual, expecedResult);
		
	}
	@Test
	public void test2() {
//		int a=10;
//		int b=10;
//		int actual=c1.sum(a, b);
		int expecedResult=20;
		
		assertEquals(c1.sum(6, 14), expecedResult);
		
	}
	@Test
	public void test3() {
	
		int expecedResult=10;
		
		assertEquals(c1.sub(20, 10), expecedResult);
		
	}
	@Test
	public void test4() {
		int a=-10;
		int b=10;
		int actual=c1.sum(a, b);
		int expecedResult=0;
		
		assertEquals(actual, expecedResult);
		
	}
	@Test
	public void test5() {
		
		
		int expecedResult=20;
		
		assertEquals(c1.sub(30, 10), expecedResult);
		
	}
	@Test
	public void test6() {
		
		int expecedResult=-10;
		
		assertEquals(c1.sub(20, 30), expecedResult);
		
	}
	@Test
	public void test7() {
		
		int expecedResult=-40;
		
		assertEquals(c1.sub(10, 50), expecedResult);
		
	}

}
