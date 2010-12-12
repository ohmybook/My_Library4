package ui;

import javax.swing.JFrame;

import control.EventHandleInterface;

/*
 * ³ÌÐòÖ÷´°¿Ú
 * by²Ü½Ü´Ï
 */
public class MainFrame extends JFrame{
	public MainFrame(EventHandleInterface eventHandler){
		super();
		this.initialize();
		this.addComponen(eventHandler);
		this.setVisible(true);
	}

	public ListArea listArea;
	public ReadingArea readingArea;
	public ReadingTool readingTool;
	public NoteArea noteArea;
	public void addComponen(EventHandleInterface eventHandler) {
		this.setJMenuBar(new MainMenu(eventHandler));
		this.add(listArea = new ListArea(eventHandler));
		this.add(readingArea = new ReadingArea(eventHandler));
		this.add(readingTool = new ReadingTool(eventHandler));
		this.add(noteArea = new NoteArea(eventHandler));
	}

	private void initialize() {
		initialize_size();
		initialize_position();
		initialize_layout();
		initialize_action();
	}

	private void initialize_action() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private int width, height;
	private void initialize_size() {
		width = 1000;
		height = 700;
		this.setSize(width, height);
	}

	private void initialize_position() {
		this.setLocation(this.getToolkit().getScreenSize().width/2-this.width/2, 
		 		 this.getToolkit().getScreenSize().height/2-this.height/2);
	}

	private void initialize_layout() {
		this.getContentPane().setLayout(null);
	}
}
