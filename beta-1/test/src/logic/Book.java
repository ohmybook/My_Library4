package logic;


import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import toolKit.Split_into_Rows;


/*
 * �����ͣ���������������Լ���״̬
 * ����һ��TXT�ļ��������ҳ
 * byҦ��
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
	//�������ر���������ȣ�
	
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
		// �ж��鱾�Ƿ��Ѵ����б���
		return false;
	}
	public Book(){
		//�����鱾�ĳ�ʼ��
	}
	public void load_content() throws IOException{
		//��ȡ�鱾����
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
		//����û�����ڿ�ʱ�ͷ��ڴ���Դ
		text = null;
	}
	public String[] get_page_content(int page){
		//��ȡָ��ҳ����ҳ������
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
		//�����鱾��Ϣ
	}
	public ArrayList<Note> search_note(){
		//���ұ��鵱ǰҳ�Ķ̼�
		return null;
	}
	public void delete_a_note(String id){
		//����IDȥɾ��ĳ����
	}
	private void getName(String dir){
		//���ݵ�ַ��ʼ��name��ֵ
	}
	
	private int rows_Per_page = 32;
	private boolean initialize_number_of_pages(){
		//��ʼ�������ҳ��
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
