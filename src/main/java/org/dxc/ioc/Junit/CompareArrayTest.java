package org.dxc.ioc.Junit;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class CompareArrayTest {
	@Test
	public void testToCompareArray() {
	int expectedArray[]= {11,12,13,14};
	int actualArray[]= {12,13,14,11};


	Arrays.sort(actualArray);
	assertArrayEquals(expectedArray,actualArray);
	}
}
