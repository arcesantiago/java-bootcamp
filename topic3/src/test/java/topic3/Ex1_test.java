package topic3;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ex1_test {
	//test method vertToString()
	@Test
	public void testConverterToSTring() {
		Ex1 ex1 = new Ex1();
		assertEquals("four thousand four hundred forty four", ex1.convertToString(4444));
	}

}
