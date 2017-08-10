package topic3;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
//this class test method wordWarpped()
public class Ex2_test {
	Ex2 ex2 = new Ex2();
	ArrayList<String> input;
	
	@Test
	public void wordWarppedTest1(){
		input = ex2.wordWrapped(3, "abcdef");
		assertEquals("abcdef",input.get(0)+input.get(1)+input.get(2));
	}
	
	@Test
	public void wordWarppedTest2(){
		input = ex2.wordWrapped(40, "01234567890123456789");
		assertEquals("01234567890123456789",input.get(0));
	}
	
	public void wordWarppedTest3(){
		input = ex2.wordWrapped(7, "hello word");
		assertEquals("hello word",input.get(0)+input.get(1));
	}
	
	@Test
	public void wordWarppedTest4(){
		input = ex2.wordWrapped(5, "holahola");
		assertEquals("holahola",input.get(0)+input.get(1));
	}

}
