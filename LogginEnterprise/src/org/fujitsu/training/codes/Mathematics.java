package org.fujitsu.training.codes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Mathematics {
	// Step 1: Create the logger
	private static final Logger LOG = 
			LogManager.getLogger("fetpLogger");
	
	public int divide(int x, int y) 
			throws ArithmeticException, Exception{
		LOG.info("executing method divide with params {} and {}", x, y);
		try {
			int q = x/ y;
			LOG.info("ending method divide with result {}", q);
			return q;
		} catch (ArithmeticException e) {
			LOG.fatal("invalid division operation.");
			throw e;
		}
		
	}

}
