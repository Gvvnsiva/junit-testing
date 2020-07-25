package org.dxc.ioc.Junit;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class ExceptionDemoTest {
	@Test
	public void testToCompareArray() {
		int expectedArray[]= {11,12,13,14};
		
		int actualArray[]= {12,13,14,11};
		
		// sorting
		Arrays.sort(actualArray);
		
		assertArrayEquals(expectedArray,actualArray);
		
	}


}
