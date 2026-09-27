package org.fujitsu.training.codes;

import org.apache.logging.log4j.core.appender.FileAppender;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMathematics {
	private Mathematics math;
	
	@BeforeEach
	public void setup() {
	   math = new Mathematics();	
	}
	
	@AfterEach
	public void teardown() {
		math = null;
	}
	
	@Test
	public void testDivide() {
		try {
			math.divide(10, 5);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
