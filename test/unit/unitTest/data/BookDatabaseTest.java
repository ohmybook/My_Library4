package data;

import static org.junit.Assert.*;

import org.junit.Test;

public class BookDatabaseTest {

	@Test
	public void testIs_contain() {
		BookDatabase bdbase = new BookDatabase();
		String source = "Readme.txt";
		String object = "Read";
		assertEquals(true,bdbase.is_contain(source,object));
		
	}
	
	@Test
	public void testIs_contain2() {
		BookDatabase bdbase = new BookDatabase();
		String source = "Readme.txt";
		String object = "Readme.txt";
		assertEquals(true,bdbase.is_contain(source,object));
		
	}
	
	@Test
	public void testIs_contain3() {
		BookDatabase bdbase = new BookDatabase();
		String source = "Read";
		String object = "Readme";
		assertEquals(false,bdbase.is_contain(source,object));
		
	}
	
	@Test
	public void testIs_contain4() {
		BookDatabase bdbase = new BookDatabase();
		String source = "";
		String object = "Read";
		assertEquals(false,bdbase.is_contain(source,object));
		
	}
	
	@Test
	public void testIs_contain5() {
		BookDatabase bdbase = new BookDatabase();
		String source = "Readme.txt";
		String object = "";
		assertEquals(true,bdbase.is_contain(source,object));
		
	}
	
	@Test
	public void testIs_contain6() {
		BookDatabase bdbase = new BookDatabase();
		String source = "";
		String object = "";
		assertEquals(true,bdbase.is_contain(source,object));
		
	}
	
	@Test
	public void testIs_contain7() {
		BookDatabase bdbase = new BookDatabase();
		String source = "阅读提示.txt";
		String object = ".";
		assertEquals(true,bdbase.is_contain(source,object));
		
	}	@Test
	public void testIs_contain8() {
		BookDatabase bdbase = new BookDatabase();
		String source = "阅读提示.txt";
		String object = "阅";
		assertEquals(true,bdbase.is_contain(source,object));
		
	}
	@Test
	public void testIs_contain9() {
		BookDatabase bdbase = new BookDatabase();
		String source = "阅读提示.txt";
		String object = "阅读提示";
		assertEquals(true,bdbase.is_contain(source,object));
		
	}
	@Test
	public void testIs_contain10() {
		BookDatabase bdbase = new BookDatabase();
		String source = "阅读提示.txt";
		String object = "阅读提示.txt";
		assertEquals(true,bdbase.is_contain(source,object));
		
	}
	
	@Test
	public void testIs_contain11() {
		BookDatabase bdbase = new BookDatabase();
		String source = "阅读提示.txt";
		String object = "txt";
		assertEquals(true,bdbase.is_contain(source,object));
		
	}
	
	@Test
	public void testIs_contain12() {
		BookDatabase bdbase = new BookDatabase();
		String source = "new阅读提示.txt";
		String object = "new";
		assertEquals(true,bdbase.is_contain(source,object));
		
	}
	
	@Test
	public void testIs_contain13() {
		BookDatabase bdbase = new BookDatabase();
		String source = "new阅读提示.txt";
		String object = "new阅";
		assertEquals(true,bdbase.is_contain(source,object));
		
	}
	
	
	@Test
	public void testIs_contain14() {
		BookDatabase bdbase = new BookDatabase();
		String source = "阅读提示.txt";
		String object = "y";
		assertEquals(false,bdbase.is_contain(source,object));
		
	}
	
	@Test
	public void testIs_contain15() {
		BookDatabase bdbase = new BookDatabase();
		String source = "新建文本文档.txt";
		String object = "i";
		assertEquals(false,bdbase.is_contain(source,object));
		
	}
	
	@Test
	public void testIs_contain16() {
		BookDatabase bdbase = new BookDatabase();
		String source = "Readme.txt";
		String object = "阅读";
		assertEquals(false,bdbase.is_contain(source,object));
		
	}
	
	@Test
	public void testIs_contain17() {
		BookDatabase bdbase = new BookDatabase();
		String source = ".///,.//,/.";
		String object = "./,";
		assertEquals(false,bdbase.is_contain(source,object));
		
	}
	
	@Test
	public void testIs_contain18() {
		BookDatabase bdbase = new BookDatabase();
		String source = ".//,///???!#@$@";
		String object = ".//";
		assertEquals(true,bdbase.is_contain(source,object));
		
	}

	@Test
	public void testIs_contain19() {
		BookDatabase bdbase = new BookDatabase();
		String source = ".//,///???!#@$@yue读。。";
		String object = "yue";
		assertEquals(true,bdbase.is_contain(source,object));
}
	
	@Test
	public void testIs_contain20() {
		BookDatabase bdbase = new BookDatabase();
		String source = ".//,///???!#@$@yue读。。";
		String object = "读。。。";
		assertEquals(false,bdbase.is_contain(source,object));
}
	@Test
	public void testIs_contain21() {
		BookDatabase bdbase = new BookDatabase();
		String source = ".//,///???!#@$@yue读。。";
		String object = "yue读。。";
		assertEquals(true,bdbase.is_contain(source,object));
}
	
	@Test
	public void testIs_contain22() {
		BookDatabase bdbase = new BookDatabase();
		String source = ".//,///???!#@$@yue读。。";
		String object = ".//,///???!#@$@yue读。。";
		assertEquals(true,bdbase.is_contain(source,object));
}
	
	@Test
	public void testIs_contain23() {
		BookDatabase bdbase = new BookDatabase();
		String source = ".//,///???!#@$@yue读。。";
		String object = ".//,///???!#@$@yue读。.";
		assertEquals(false,bdbase.is_contain(source,object));
}
}
