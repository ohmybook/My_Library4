package ui;

import java.awt.*;
import java.io.FilenameFilter;

import javax.swing.JFileChooser;

/*
 * �޶�ѡ����ļ���ʽΪ.txt
 * �˳�ʱ���ش򿪵���ĵ�ַ����Book�ࣩ
 * by�ܴܽ�
*/
public class OpenFileDialog extends FileDialog{
	public OpenFileDialog(MainFrame window){
		super(window, "���ļ�", LOAD);
		//String[] filter = {".txt"};
		//this.setFilenameFilter((FilenameFilter) new FilenFilter(filter));
		this.setVisible(true);
		
		//this.setUndecorated(true);//ȡ��Ĭ�ϴ���
	}
	/*
	public void updatelocation(){
		int px = window.getLocation().x + (window.getWidth() - this.getWidth())/2;
		int py = window.getLocation().y + (window.getHeight() - this.getHeight())/2;
		this.setLocation(300, 300);	
	}*/
}
