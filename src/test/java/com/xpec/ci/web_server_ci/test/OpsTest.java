package com.xpec.ci.web_server_ci.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.xpec.ci.web_server_ci.ops.Ops;

public class OpsTest {

	@Test
	public void testSum() {
		Ops ops = new Ops();
		assertEquals("2 + 3 must be 4", 4, ops.sum(2, 2));		
	}
	
	@Test
	public void testMultiSum(){
		Ops ops = new Ops();
		assertEquals("2 + 3 + 5 + 6 + 10 must be 26", 26, ops.multiSum(2, 3, 5, 6, 10));
	}

}
