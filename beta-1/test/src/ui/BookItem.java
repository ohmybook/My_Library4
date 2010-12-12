package ui;


import javax.swing.JButton;

import logic.Book;

public class BookItem extends JButton{
	public BookItem(String bookDirection, int px, int py){
		this.initialize(px, py);
		this.setText(Book.get_name(bookDirection));
	}

	private void initialize(int px, int py) {
		this.setBounds(px, py, 120, 25);
	}
}
