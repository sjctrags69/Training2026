package org.fujitsu.training.codes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

public class TestMathematics {
	private Mathematics math;
	
	@AfterEach
	public void teardown() {
	  math = null;	
	}
	
	@BeforeEach
	public void setup() {
		 math = new Mathematics();
	}
	
	@RepeatedTest(20)
	public void testDivide() {
		int res  = math.divide(10, 1);
		System.out.println(res);
	}

}
