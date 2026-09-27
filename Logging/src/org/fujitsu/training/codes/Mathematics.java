package org.fujitsu.training.codes;

import java.util.logging.Logger;

public class Mathematics {
	// Step 1: Create the logger
	private static Logger log = 
			Logger.getLogger(Mathematics.class.getName());
	
	
	public int divide(int x, int y) {
		log.info("executing divide() with params %d %d"
				    .formatted(x, y));
		try {
			int q = x/ y;
			log.info("return value %d".formatted(q));
			return q;
		} catch (ArithmeticException e) {
			log.severe("division by zero error");
		}
		return 0;
	}

}
