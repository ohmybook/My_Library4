package ui;

import java.awt.Color;

import javax.swing.JLabel;

import control.EventHandleInterface;

public class ReadingArea extends JLabel{

	private EventHandleInterface eventHandler;
	public ReadingArea(EventHandleInterface eventHandler) {
		this.eventHandler = eventHandler;
		this.initialize();
		this.initialize_lines();
	}
	
	JLabel lines[] = new JLabel[32];
	private void initialize_lines() {
		for(int lineCount = 0; lineCount < lines.length; lineCount++){
			lines[lineCount] = new JLabel();
			lines[lineCount].setBounds(30+390*(int)(lineCount/(lines.length/2)), 28+28*(lineCount%(lines.length/2)), 350, 25);
			lines[lineCount].setOpaque(true);
			lines[lineCount].setBackground(Color.yellow);
			this.add(lines[lineCount]);
		}			
		
	}
	private void initialize() {
		this.setBounds(100, 70, 800, 500);
		this.setBackground(Color.lightGray);
		this.setOpaque(true);
	}
	public void update_text(String text[]) {
		for(int lineCount = 0; lineCount < 32; lineCount++)
			lines[lineCount].setText(" "+text[lineCount]);
	}

}
