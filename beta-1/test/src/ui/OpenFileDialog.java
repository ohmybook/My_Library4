package ui;

import java.awt.*;
import java.io.FilenameFilter;

import javax.swing.JFileChooser;

/*
 * 限定选择的文件格式为.txt
 * 退出时返回打开的书的地址（或Book类）
 * by曹杰聪
*/
public class OpenFileDialog extends FileDialog{
	public OpenFileDialog(MainFrame window){
		super(window, "打开文件", LOAD);
		//String[] filter = {".txt"};
		//this.setFilenameFilter((FilenameFilter) new FilenFilter(filter));
		this.setVisible(true);
		
		//this.setUndecorated(true);//取消默认窗口
	}
	/*
	public void updatelocation(){
		int px = window.getLocation().x + (window.getWidth() - this.getWidth())/2;
		int py = window.getLocation().y + (window.getHeight() - this.getHeight())/2;
		this.setLocation(300, 300);	
	}*/
}
