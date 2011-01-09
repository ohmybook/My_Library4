package logic;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

public class BookTest {

	@Test
	public void testGet_list_name() {
		String listName = "List1";
		Book books = new Book();
		books.chang_listName(listName);
		assertEquals(listName,books.get_list_name());
		
	}
	
	@Test
	public void testGet_list_name2() {
		String listName = null;
		Book books = new Book();
		books.chang_listName(listName);
		assertEquals(listName,books.get_list_name());
		
	}


	@Test
	public void testLoad_content() throws IOException {
		String direction = "D:\\1.txt";
		Book books = new Book();
		books.chang_direction(direction);
		books.load_content();
		ArrayList<String>  arraylist = new ArrayList<String>();
		String s2 = "hello world!";
		arraylist.add(s2);
		assertEquals(arraylist,books.get_text());
	}
	
	@Test
	public void testLoad_content2() throws IOException {
		String direction = "D:\\4.txt";
		Book books = new Book();
		books.chang_direction(direction);
		books.load_content();
		ArrayList<String>  arraylist = new ArrayList<String>();
		String s2 = "你是否是大方的萨芬的萨菲";
		arraylist.add(s2);
		assertEquals(arraylist,books.get_text());
	}
	
	@Test
	public void testLoad_content3() throws IOException {
		String direction = "D:\\5.txt";
		Book books = new Book();
		books.chang_direction(direction);
		books.load_content();
		ArrayList<String>  arraylist = new ArrayList<String>();
		String s2 = "hello world!";
		for(int  i = 0 ;i < 33 ; i++){
		arraylist.add(s2);}
		assertEquals(arraylist,books.get_text());
	}

	@Test
	public void testRelease() {
		ArrayList<String> text = new ArrayList<String>();
		String s = "sdafdsafdsaf";
		text.add(s);
		Book books = new Book();
		books.chang_text(text);
		books.release();
		assertEquals(null,books.get_text());
	}
	
	@Test
	public void testRelease2() {
		ArrayList<String> text = new ArrayList<String>();
		String s = null;
		text.add(s);
		Book books = new Book();
		books.chang_text(text);
		books.release();
		assertEquals(null,books.get_text());
	}


	@Test
	public void testGet_current_page_content() throws IOException {
		String[] arraystr = new String[32];
		arraystr[0] = "hello world!";
		arraystr[1] = "hello world!";
		for (int i = 2;i<32;i++)
		{
			arraystr[i] = "";
		}
		Book books = new Book();
		String direction = "D:\\2.txt";
		books.chang_direction(direction);
		books.load_content();
		int cp = 1;
		books.chang_currentPage(cp);
		assertEquals(arraystr,books.get_current_page_content());
	}
	
	@Test
	public void testGet_current_page_content2() throws IOException {
		String[] arraystr = new String[32];
		for (int i = 0;i<32;i++)
		{
			arraystr[i] = "";
		}
		Book books = new Book();
		String direction = "D:\\3.txt";
		books.chang_direction(direction);
		books.load_content();
		int cp = 1;
		books.chang_currentPage(cp);
		assertEquals(arraystr,books.get_current_page_content());
	}
	
	@Test
	public void testGet_current_page_content3() throws IOException {
		String[] arraystr = new String[32];
		arraystr[0] = "你是否是大方的萨芬的萨菲";
		for (int i = 1;i<32;i++)
		{
			arraystr[i] = "";
		}
		Book books = new Book();
		String direction = "D:\\4.txt";
		books.chang_direction(direction);
		books.load_content();
		int cp = 1;
		books.chang_currentPage(cp);
		assertEquals(arraystr,books.get_current_page_content());
	}

	@Test
	public void testGet_current_page_content4() throws IOException {
		String[] arraystr = new String[32];
		arraystr[0] = "hello world!";
		for (int i = 1;i<32;i++)
		{
			arraystr[i] = "";
		}
		Book books = new Book();
		String direction = "D:\\5.txt";
		books.chang_direction(direction);
		books.load_content();
		int cp = 2;
		books.chang_currentPage(cp);
		assertEquals(arraystr,books.get_current_page_content());
	}
	
	@Test
	public void testGet_current_page_content5() throws IOException {
		String[] arraystr = new String[32];
		for (int i = 0;i<32;i++)
		{
			arraystr[i] = "";
		}
		Book books = new Book();
		String direction = "D:\\5.txt";
		books.chang_direction(direction);
		books.load_content();
		int cp = 3;
		books.chang_currentPage(cp);
		assertEquals(arraystr,books.get_current_page_content());
	}

	@Test
	public void testGet_nameString() {
		String bookdirection = "D:/软件工程/123.txt";
		Book books = new Book();
		assertEquals("123",books.get_name(bookdirection));
	}

	@Test
	public void testPrevious_page() {
		Book books = new Book();
		books.chang_numberOfPages(10);
		books.previous_page();
		assertEquals(0,books.get_currentPage());
	}

	@Test
	public void testPrevious_page2() {
		Book books = new Book();
		books.chang_numberOfPages(10);
		books.chang_currentPage(5);
		books.previous_page();
		assertEquals(4,books.get_currentPage());
	}
	
	
	
	@Test
	public void testNext_page() {
		Book books = new Book();
		books.chang_numberOfPages(100);
		books.chang_currentPage(15);
		books.next_page();
		assertEquals(16,books.get_currentPage());
	}
	
	@Test
	public void testNext_page2() {
		Book books = new Book();
		books.chang_numberOfPages(100);
		books.chang_currentPage(100);
		books.next_page();
		assertEquals(100,books.get_currentPage());
	}

	@Test
	public void testNext_page3() {
		Book books = new Book();
		books.chang_numberOfPages(10);
		books.next_page();
		assertEquals(1,books.get_currentPage());
	}
	
	@Test
	public void testGet_direction() {
		Book books = new Book();
		books.chang_direction("D:/soft/123.txt");
		assertEquals("D:/soft/123.txt",books.get_direction());
	}
	
	@Test
	public void testGet_direction2() {
		Book books = new Book();
		assertEquals(null,books.get_direction());
	}

	@Test
	public void testGet_score() {
		Book books = new Book();
		assertEquals(0,books.get_score());
	}
	
	@Test
	public void testGet_score2(){
		Book books = new Book();
		books.chang_score(100);
		assertEquals(100,books.get_score());
		}

	@Test
	public void testGet_progress() {
		Book books = new Book();
		assertEquals(0, books.get_progress());
	}
	
	@Test
	public void testGet_progress2(){
		Book books = new Book();
		books.chang_currentPage(15);
		books.chang_numberOfPages(20);
		assertEquals(75,books.get_progress());
	}
	
	@Test
	public void testGet_progress3(){
		Book books = new Book();
		books.chang_currentPage(50);
		books.chang_numberOfPages(50);
		assertEquals(100,books.get_progress());
	}
	@Test
	public void testAdd_score() {
		Book books = new Book();
		books.add_score();
		assertEquals(1,books.get_score());
	}
	
	@Test
	public void testAdd_score2(){
		Book books = new Book();
		books.chang_score(9);
		books.add_score();
		assertEquals(10,books.get_score());
	}
	
	@Test
	public void testAdd_score3(){
		Book books = new Book();
		books.chang_score(10);
		books.add_score();
		assertEquals(10,books.get_score());
	}
	
	@Test
	public void testDecrease_score() {
		Book books = new Book();
		books.chang_score(0);
		books.decrease_score();
		assertEquals(0,books.get_score());
	}
	
	@Test
	public void testDecrease_score2(){
		Book books = new Book();
		books.chang_score(5);
		books.decrease_score();
		assertEquals(4,books.get_score());
	}

}
