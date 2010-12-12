package logic;


import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import toolKit.Split_into_Rows;


/*
 * 书类型，用来保存书的属性及其状态
 * 处理一个TXT文件，将其分页
 * by姚明
 */
public class Book {
	
	private int pageword = 50;
	private ArrayList<String> text = new ArrayList<String>();
	private String name;
	private String listName;
	private String direction;
	private int currentPage;
	private int numberOfRows;
	private int numberOfPages;
	private int score;
	//还有隐藏变量比如进度％
	
	public Book(String bookDirection) throws IOException{
		this.direction = bookDirection;
		if(this.exist()){
			initialize_from_database();	
		}else{
			initialize();
		}
	}
	private void initialize_from_database() {
		// TODO Auto-generated method stub		
	}
	private void initialize() throws IOException {
		this.currentPage = 1;
		this.score = 0;
		this.load_content();
		this.initialize_number_of_pages();
		this.getName(this.direction);
	}
	private boolean exist() {
		// 判断书本是否已存在列表中
		return false;
	}
	public Book(){
		//已有书本的初始化
	}
	public void load_content() throws IOException{
		//获取书本内容
		BufferedReader buffereReader = new BufferedReader(new FileReader(new File(direction)));
		String paragraph;
		while((paragraph = buffereReader.readLine()) != null){
			this.add_paragraph(paragraph);
		} 
	}
	
	private final int charactersOfOneRow = 26;
	private Split_into_Rows split_into_rows = new Split_into_Rows();
	private void add_paragraph(String paragraph) {
		ArrayList<String> rows = split_into_rows.divide_into_rows(paragraph);
		for(int countRows = 0; countRows < rows.size(); countRows++)
			text.add(rows.get(countRows));
		numberOfRows = text.size();
	}
	
	private int rows_of(String paragraph) {
		return (paragraph.length() ) / this.charactersOfOneRow +1; 
	}
	
	public void release(){
		//当书没有正在看时释放内存资源
		text = null;
	}
	public String[] get_page_content(int page){
		//获取指定页数的页面内容
		String pagetext[] = new String[32];
		for(int pageCount = 0; pageCount < pagetext.length; pageCount++){
			int totalRows = (page - 1) * 32 + pageCount;
			pagetext[pageCount] = totalRows < text.size()? this.text.get((page - 1) * 32 + pageCount) : "";
		}
		return pagetext;
	}
	public String[] get_current_page_content(){
		return get_page_content(currentPage);
	}
	public void save(){
		//保存书本信息
	}
	public ArrayList<Note> search_note(){
		//查找本书当前页的短笺
		return null;
	}
	public void delete_a_note(String id){
		//根据ID去删除某本书
	}
	private void getName(String dir){
		//根据地址初始化name的值
	}
	
	private int rows_Per_page = 32;
	private boolean initialize_number_of_pages(){
		//初始化书的总页数
		numberOfPages = numberOfRows/rows_Per_page + 1;
		return true;
	}
	public void previous_page() {
		if(currentPage > 1)
			currentPage--;
	}
	
	
	public void next_page() {
		if(currentPage < this.numberOfPages)
			currentPage++;
	}
}
