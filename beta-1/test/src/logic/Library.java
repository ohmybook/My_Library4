package logic;

import java.io.IOException;
import java.util.ArrayList;

import data.DataManager;

/*
 * 书库类
 * by冀中浩
 */
public class Library {
	private ArrayList<String> lists;
	private ArrayList<String> recentReadBook;
	private DataManager dataManager;
	private Book currentBook;
	
	public Library(){
		dataManager = new DataManager();
		lists = new ArrayList<String>();
		recentReadBook =new ArrayList<String>();
		lists.add("defult");
	}
	public void add_a_book(String bookdir){
		//加入一本新书,需判断是否已加入（通过bookdir）
	}
	public void add_a_list(String listname){
		//新建一个书的类或书的列表
	}
	public void save(){
		//保存书库的信息
	}
	public void set_current_book(String bookdir){
		//设置当前正在看的书
		//需要判断是否已存在书库中
		//把本书加到recentbook列表中
		try {
			currentBook = new Book(bookdir);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public Book get_current_book(){
		return currentBook;
	}
	public String search_book(String bookname){
		//查找一本书
		return null;
	}
	public void delete_a_book(String bookdir){
		//通过地址来删除某本书
	}
}
