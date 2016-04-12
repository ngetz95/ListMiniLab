import static org.junit.Assert.*;
import org.junit.*;
import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ListTest {

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testAddElement() {
		List<String> ryuko = new List<String>();
		String senketsu = "synchronize";
		ryuko.addElement(senketsu);
		
	}

	@Test
	public void testRemoveElement() {
		List<String> satsuki = new List<String>();
		String junketsu = "override";
		satsuki.addElement(junketsu);
		satsuki.removeElement(0);
	}
	
	@Test
	public void testRemoveFirst() {
		List<String> ragyo = new List<String>();
		String koketsu = "override";
		ragyo.addElement(koketsu);
		ragyo.removeFirst();
	}
	
	@Test
	public void testSize() {
		List<String> stringList = new List<String>();
		assertEquals("Initial size of list is not 0. ", 0, stringList.size());
	}
	
	/**
	 * Test to see if exception is thrown when an attempt is made
	 * to remove an item after the end of the list. 
	 */
	@Test(expected = NoSuchElementException.class)
	public void testRemoveFromEmpty()
	{
		List<String> stringList = new List<String>();
		String cur = stringList.removeElement(30);
	}
}
