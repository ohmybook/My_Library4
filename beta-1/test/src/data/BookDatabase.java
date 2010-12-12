package data;

import java.util.ArrayList;

public class BookDatabase {

	private String tableName = "book";
	
	public BookDatabase(){
	}
	
	public void delete_a_book(String direction){
		String condition=" direction="+direction;
		DatabaseManager.delete(tableName, condition);
	}
	
	public void add_a_book(String direction,String bookname,String listName,String currentPage){
		String value="'"+direction+"','"+bookname+"','"+listName+"','"+currentPage+"'";
		DatabaseManager.add(tableName,value);	
	}
	
	public ArrayList<String> search_a_book(String direction){
		String sql="select * from book where direction="+direction;
		ArrayList<String> result = DatabaseManager.serach(sql);
		return result;
	}
	
	public ArrayList<String> search_books(String listName){
		String sql="select direction from book where listName = '" + listName + "'";
		return DatabaseManager.serach(sql);
	}
}
