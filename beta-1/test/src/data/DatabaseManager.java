package data;



	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSetMetaData;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.sql.ResultSet;
	
import java.util.ArrayList;



	
	public class DatabaseManager {
	 //默认主机为服务器
	 private static String DBDriver="com.mysql.jdbc.Driver";
	 
	 private static ResultSet resultset;
	 private static Connection connection;
	 
	 public DatabaseManager(){
	 }
	 
	 public static void database_connect(){
		 try{
			 Class.forName(DBDriver).newInstance();
			 connection=DriverManager.getConnection("jdbc:mysql://localhost/DBforbook","root","root");
		 }catch(SQLException e){
			 System.out.println(e.getMessage()); 
		 }catch(Exception e){
			 System.out.println(e.getMessage()); 
	     }
	 }

	 
	 public static void insert(String sql){     //增删改
	  try{
		  Statement stm=connection.createStatement();
		  stm.executeUpdate(sql);
	  }catch(Exception e){
		  System.out.println(e.getMessage());
	  }
	 }

	 
	 
	 
	 public static ResultSet query(String sql){      //查询 
		 try{
			 Statement statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE); 
			 resultset=statement.executeQuery(sql);    
	     }catch(Exception e){
	    	 System.out.println(e.getMessage());
	     } 
	     return resultset;
	 }
	 
	 public static void delete(String table, String condition){
		 insert("delete from " + table + "where " + condition);
	 }
	 public static void update(String table, String attribute, String value, String condition){
		 insert("update " + table + "set " + attribute + "=" + value + "where " + condition);
	 }
	 public static void add(String table, String values){
		 insert("insert into " + table + " values (" + values + ")");
	 }
	 

	 public static ArrayList<String> serach(String sql){
		 ArrayList<String> querylist = new ArrayList<String>();
		 try {
			 ResultSet rs = query(sql);
			 ResultSetMetaData rsmd = rs.getMetaData();
		 
			 while(rs.next()) {
				 for(int i = 0; i < rsmd.getColumnCount(); i++)
					 querylist.add(rs.getString(i)); 
			 }	     
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return querylist;
	 }	 
	 
	public void create_tables(){
		this.bulid_book_table();
		this.bulid_note_table();
	}
		
	private void bulid_book_table(){
		DatabaseManager.insert("create table book(direction char(40)," +
		"bookname char(40),listName char(40),currentPage char(40))");
	}
		
	private void bulid_note_table(){
		DatabaseManager.insert("create table note(context char(40)," +
				"date char(40),page char(40),bookname char(40))");
	}
	 
	 public static void database_close(){
		 try
		 {
			 resultset.close();
			 connection.close();
		 }
		 catch(Exception e)
		 {
			 System.out.println(e.getMessage());
		 }
	 }	 
	} 
	

