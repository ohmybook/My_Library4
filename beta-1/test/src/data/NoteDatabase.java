package data;

import java.util.ArrayList;

public class NoteDatabase {

	String databasename;
	
	public NoteDatabase(){
		databasename="note";
	}
	
	public void delete_a_note(String bookname,String page){
		String condition=" bookname='"+bookname+"' and page='"+page+"'";
		DatabaseManager.delete(databasename, condition);
	}
	
	public void add_a_note(String context,String date,String page,String bookname){
		String value="'"+context+"','"+date+"','"+page+"','"+bookname+"'";
		DatabaseManager.add(databasename,value);		
	}
	
	public ArrayList<String> search_a_note(String bookname,String page){
		String sql="select * from book where bookname='"+bookname+"' and page='"+page+"'";
		return DatabaseManager.serach(sql);
	}
	
}
