package data;

import static org.junit.Assert.*;

import org.junit.Test;

public class ListDatabaseTest {

	@Test
	public void testIs_contain() {
		ListDatabase listDatabase = new ListDatabase();
		String source = "Readme.txt";
		String object = "Read";
		assertEquals(true,listDatabase.is_contain(source,object));
		
	}
	
	@Test
	public void testIs_contain2() {
		ListDatabase listDatabase = new ListDatabase();
		String source = "Readme.txt";
		String object = "Readme.txt";
		assertEquals(true,listDatabase.is_contain(source,object));
		
	}
	
	@Test
	public void testIs_contain3() {
		ListDatabase listDatabase = new ListDatabase();
		String source = "Read";
		String object = "Readme";
		assertEquals(false,listDatabase.is_contain(source,object));
		
	}
	
	@Test
	public void testIs_contain4() {
		ListDatabase listDatabase = new ListDatabase();
		String source = "";
		String object = "Read";
		assertEquals(false,listDatabase.is_contain(source,object));
		
	}
	
	@Test
	public void testIs_contain5() {
		ListDatabase listDatabase = new ListDatabase();
		String source = "Readme.txt";
		String object = "";
		assertEquals(true,listDatabase.is_contain(source,object));
		
	}
	
	@Test
	public void testIs_contain6() {
		ListDatabase listDatabase = new ListDatabase();
		String source = "";
		String object = "";
		assertEquals(true,listDatabase.is_contain(source,object));
		
	}
	
	@Test
	public void testIs_contain7() {
		ListDatabase listDatabase = new ListDatabase();
		String source = "�Ķ���ʾ.txt";
		String object = ".";
		assertEquals(true,listDatabase.is_contain(source,object));
		
	}	@Test
	public void testIs_contain8() {
		ListDatabase listDatabase = new ListDatabase();
		String source = "�Ķ���ʾ.txt";
		String object = "��";
		assertEquals(true,listDatabase.is_contain(source,object));
		
	}
	@Test
	public void testIs_contain9() {
		ListDatabase listDatabase = new ListDatabase();
		String source = "�Ķ���ʾ.txt";
		String object = "�Ķ���ʾ";
		assertEquals(true,listDatabase.is_contain(source,object));
		
	}
	@Test
	public void testIs_contain10() {
		ListDatabase listDatabase = new ListDatabase();
		String source = "�Ķ���ʾ.txt";
		String object = "�Ķ���ʾ.txt";
		assertEquals(true,listDatabase.is_contain(source,object));
		
	}
	
	@Test
	public void testIs_contain11() {
		ListDatabase listDatabase = new ListDatabase();
		String source = "�Ķ���ʾ.txt";
		String object = "txt";
		assertEquals(true,listDatabase.is_contain(source,object));
		
	}
	
	@Test
	public void testIs_contain12() {
		ListDatabase listDatabase = new ListDatabase();
		String source = "new�Ķ���ʾ.txt";
		String object = "new";
		assertEquals(true,listDatabase.is_contain(source,object));
		
	}
	
	@Test
	public void testIs_contain13() {
		ListDatabase listDatabase = new ListDatabase();
		String source = "new�Ķ���ʾ.txt";
		String object = "new��";
		assertEquals(true,listDatabase.is_contain(source,object));
		
	}
	
	
	@Test
	public void testIs_contain14() {
		ListDatabase listDatabase = new ListDatabase();
		String source = "�Ķ���ʾ.txt";
		String object = "y";
		assertEquals(false,listDatabase.is_contain(source,object));
		
	}
	
	@Test
	public void testIs_contain15() {
		ListDatabase listDatabase = new ListDatabase();
		String source = "�½��ı��ĵ�.txt";
		String object = "i";
		assertEquals(false,listDatabase.is_contain(source,object));
		
	}
	
	@Test
	public void testIs_contain16() {
		ListDatabase listDatabase = new ListDatabase();
		String source = "Readme.txt";
		String object = "�Ķ�";
		assertEquals(false,listDatabase.is_contain(source,object));
		
	}
	
	@Test
	public void testIs_contain17() {
		ListDatabase listDatabase = new ListDatabase();
		String source = ".///,.//,/.";
		String object = "./,";
		assertEquals(false,listDatabase.is_contain(source,object));
		
	}
	
	@Test
	public void testIs_contain18() {
		ListDatabase listDatabase = new ListDatabase();
		String source = ".//,///???!#@$@";
		String object = ".//";
		assertEquals(true,listDatabase.is_contain(source,object));
		
	}

	@Test
	public void testIs_contain19() {
		ListDatabase listDatabase = new ListDatabase();
		String source = ".//,///???!#@$@yue������";
		String object = "yue";
		assertEquals(true,listDatabase.is_contain(source,object));
}
	
	@Test
	public void testIs_contain20() {
		ListDatabase listDatabase = new ListDatabase();
		String source = ".//,///???!#@$@yue������";
		String object = "��������";
		assertEquals(false,listDatabase.is_contain(source,object));
}
	@Test
	public void testIs_contain21() {
		ListDatabase listDatabase = new ListDatabase();
		String source = ".//,///???!#@$@yue������";
		String object = "yue������";
		assertEquals(true,listDatabase.is_contain(source,object));
}
	
	@Test
	public void testIs_contain22() {
		ListDatabase listDatabase = new ListDatabase();
		String source = ".//,///???!#@$@yue������";
		String object = ".//,///???!#@$@yue������";
		assertEquals(true,listDatabase.is_contain(source,object));
}
	
	@Test
	public void testIs_contain23() {
		ListDatabase listDatabase = new ListDatabase();
		String source = ".//,///???!#@$@yue������";
		String object = ".//,///???!#@$@yue����.";
		assertEquals(false,listDatabase.is_contain(source,object));
}
}