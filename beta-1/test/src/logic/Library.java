package logic;

import java.io.IOException;
import java.util.ArrayList;

import data.DataManager;

/*
 * �����
 * by���к�
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
		//����һ������,���ж��Ƿ��Ѽ��루ͨ��bookdir��
	}
	public void add_a_list(String listname){
		//�½�һ������������б�
	}
	public void save(){
		//����������Ϣ
	}
	public void set_current_book(String bookdir){
		//���õ�ǰ���ڿ�����
		//��Ҫ�ж��Ƿ��Ѵ��������
		//�ѱ���ӵ�recentbook�б���
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
		//����һ����
		return null;
	}
	public void delete_a_book(String bookdir){
		//ͨ����ַ��ɾ��ĳ����
	}
}
