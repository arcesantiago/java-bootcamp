package topic3;

import static org.junit.Assert.*;
import org.junit.Test;

public class Ex4_test {
	Ex4 ex4;
	
	public Ex4_test() {
		ex4 = new Ex4();
	}
	//test int to roman
	@Test
	public void testConverterToRoman() {
		assertEquals("XCIX", ex4.converterToRoman(99));
	}
	// test roman to int
	@Test
	public void testConverterToInt(){
		assertEquals(20, (int)ex4.converterToInt("XX"));
	}

}
