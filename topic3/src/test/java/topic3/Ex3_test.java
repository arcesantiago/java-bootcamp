package topic3;

import static org.junit.Assert.*;
import org.junit.Test;
//test methos of topic 3 ex3
public class Ex3_test {
	Ex3 list = new Ex3();
	//test if list is empty
	@Test
	public void testEmpty() {
		assertTrue(list.isEmpty());
	}
	//test if list add correctly
	@Test
	public void testAdd(){
		list.open("file1.exe");
		assertFalse(list.isEmpty());
	}
	//test if list remove the last object and replace whit last added
	@Test
	public void testAddLast(){
		list.open("file2.exe");
		list.open("file3.exe");
		list.open("file4.exe");
		list.open("file5.exe");
		assertEquals("file5.exe",list.getLast());
	}
	//method to test top of list
	@Test
	public void testTop(){
		list.open("file2.exe");
		list.open("file3.exe");
		list.open("file4.exe");
		list.open("file5.exe");
		assertEquals(3, list.size());
	}
}
