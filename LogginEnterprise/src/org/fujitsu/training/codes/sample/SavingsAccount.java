package org.fujitsu.training.codes.sample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SavingsAccount {
	private static final Logger LOG = 
			LogManager.getLogger("savingsLogger");
	
	public double compute(double x, double y) {
		LOG.info("executed method compute with params {} and {}", x, y);
		return x + y;
	}

}
