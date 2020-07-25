package org.dxc.parameterizedtest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class CaluculatorList {
	private int expected;
	private int input1;
	private int input2;
	private Calculator calculator=null;
@Before
	public void init() {
		calculator=new Calculator();
	}

	public CaluculatorList(int expected, int input1, int input2) {
		super();
		this.expected = expected;
		this.input1 = input1;
		this.input2 = input2;
	}
	@Parameters
	public static Collection<Object[]> testParameter(){
		Object[][] object =new Object[][] {
			{5,3,2},{10,5,5},{15,10,5}
		};
		
		return Arrays.asList(object);
			
	}
	@Test
	public void testAdd() {
		
		assertEquals(expected,calculator.add(input1,input2));
	}
	
	@Test
	public void testSub() {
		
		assertEquals(expected,calculator.sub(input1,input2));
	}


}
