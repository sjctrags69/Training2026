package org.fujitsu.training.codes;

import org.fujitsu.training.codes.sample.SavingsAccount;
import org.junit.jupiter.api.Test;

public class TestSavingsAccount {
	
	@Test
	public void testCompute() {
		SavingsAccount sa = new SavingsAccount();
		sa.compute(10, 20);
	}

}
