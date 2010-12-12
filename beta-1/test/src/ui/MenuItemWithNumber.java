package ui;

import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

public class MenuItemWithNumber extends JMenuItem{
	private int number;
	public MenuItemWithNumber(String itemName, int number, ActionListener actionListener){
		super(itemName);
		this.number = number;
		this.addActionListener(actionListener);
	}
	public int get_number(){
		return number;
	}
}
