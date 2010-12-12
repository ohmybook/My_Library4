package control;

import java.io.IOException;

import logic.Library;
import ui.MainFrame;
import ui.OpenFileDialog;

public class EventHandler implements EventHandleInterface{
	private MainFrame mainFrame = new MainFrame(this);
	private Library library = new Library();
	public EventHandler(){
		super();
	}
	@Override
	public void ouput(String command) {
		mainFrame.readingArea.setText(command);
	}
	@Override
	public void select_file() {
		OpenFileDialog fileDialog = new OpenFileDialog(mainFrame);
		if(fileDialog.getDirectory()!=null && fileDialog.getFile()!=null){     //点确定时才执行操作 		
			library.set_current_book( fileDialog.getDirectory()+fileDialog.getFile());
			update_content_of_reading_area();
		}
	}
	@Override
	public void back_to_the_previous_page() {
		if(library.get_current_book() != null){
			library.get_current_book().previous_page();
			update_content_of_reading_area();
		}
	}
	@Override
	public void go_to_the_next_page() {
		if(library.get_current_book() != null){
			library.get_current_book().next_page();
			update_content_of_reading_area();
		}
	}
	private void update_content_of_reading_area() {
		mainFrame.readingArea.update_text(library.get_current_book().get_current_page_content());
	}
	@Override
	public void sofeware_initialize() {
		
		
	}
	@Override
	public void sofeware_save_setting() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sofeware_save_status() {
		// TODO Auto-generated method stub
		
	}
}
