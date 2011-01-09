package logic;

import static org.junit.Assert.*;

import global.Global;

import java.util.ArrayList;

import org.junit.Test;

import data.ListDatabase;

public class LibraryTest {

	@Test
	public void testLibrary() {
		
	}

	@Test
	public void testSet_current_list() {
		
	    String expectedList = "历史军事";
		Library library = new Library();
		library.set_current_list(expectedList);
		String resultList = library.get_current_list();
		assertEquals(expectedList,resultList);
		
	}

	@Test
	public void testGet_current_list() {
		
		String expectedList = "默认列表";
		Library library = new Library();
		String resultList = library.get_current_list();
		assertEquals(expectedList,resultList);
		
	}

	@Test
	public void testAdd_a_book() {
		
		
	}
	
	@Test
	public void testAdd_to_recent_read_book() {
		
		String firstDirection = "a";
		String secondDirection = "b";
		Library library = new Library();
		library.add_to_recent_read_book(firstDirection);
		library.add_to_recent_read_book(secondDirection);
		assertEquals(secondDirection,library.recentReadBook[0]);
		assertEquals(firstDirection,library.recentReadBook[1]);
		
		
	}
	
	@Test
	public void edgeTestAdd_to_recent_read_book() {
		
		String firstDirection = "a";
		String secondDirection = "b";
		String thirdDirection = "c";
		String fourthDirection = "d";
		String fifthDirection = "e";
		String sixthDirection = "f";
		String seventhDirction = "g";
		String eighthDirection = "h";
		String ninthDirection = "i";
		String tenthDirection = "j";
		String eleventhDirection = "k";
		
		Library library = new Library();
		library.add_to_recent_read_book(firstDirection);
		library.add_to_recent_read_book(secondDirection);
		library.add_to_recent_read_book(thirdDirection);
		library.add_to_recent_read_book(fourthDirection);
		library.add_to_recent_read_book(fifthDirection);
		library.add_to_recent_read_book(sixthDirection);
		library.add_to_recent_read_book(seventhDirction);
		library.add_to_recent_read_book(eighthDirection);
		library.add_to_recent_read_book(ninthDirection);
		library.add_to_recent_read_book(tenthDirection);
		library.add_to_recent_read_book(eleventhDirection);
		
		assertEquals(eleventhDirection,library.recentReadBook[0]);
		assertEquals(tenthDirection,library.recentReadBook[9]);
		
		
	}
	
	
	
	
	

}