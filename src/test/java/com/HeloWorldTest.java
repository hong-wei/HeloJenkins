package com;

import static org.junit.Assert.*;

import org.junit.Test;

public class HeloWorldTest {

	@Test
	public void test() {
		new HeloWorld().say();
		assertTrue(true);
	}

}
