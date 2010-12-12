package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import control.EventHandleInterface;

/*
 * ���˵�
 *by�ܴܽ�
 */
public class MainMenu extends JMenuBar implements ActionListener{

	public MainMenu(EventHandleInterface eventHandler) {
		super();
		initialize_event_handler(eventHandler);
		initialize_menu();
	}
	
	EventHandleInterface eventHandler;
	private void initialize_event_handler(EventHandleInterface eventHandler) {
		this.eventHandler = eventHandler;
	}

	private void initialize_menu() {
		String[][] menuString = {
				{"�ļ�", "������", "��", "�˳�"},
				{"����", "��һҳ", "��һҳ", "�Զ�����", "��ӱ�ǩ"},
				{"�ҵ����", "Ĭ���б�", "����б�"},
				{"����", "��������", "Ƥ������", "ϵͳ����"},
				{"����", "����ָ��", "��������"}
			};
			set_menu(menuString);
	}

	private void set_menu(String[][] menuString) {
		for(int perList = 0; perList < menuString.length; perList++){
			JMenu menu = new JMenu(menuString[perList][0]);
			this.add(menu);
			for(int selection = 1; selection < menuString[perList].length; selection++)
				menu.add(to_menu_item(menuString[perList][selection], this));
		}
		JMenuItem a = new JMenuItem();
	}

	private JMenuItem to_menu_item(String name, ActionListener actionListener) {
		JMenuItem menuItem = new JMenuItem(name);
		menuItem.addActionListener(actionListener);
		return menuItem;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if(command.equals("������")){			
		}else if(command.equals("��")){
			eventHandler.select_file();
		}else if(command.equals("�˳�")){
		}else if(command.equals("��һҳ")){
		}else if(command.equals("��һҳ")){
		}else if(command.equals("�Զ�����")){
		}else if(command.equals("��ӱ�ǩ")){
		}else if(command.equals("Ĭ���б�")){
		}else if(command.equals("����б�")){
		}else if(command.equals("��������")){
		}else if(command.equals("Ƥ������")){
		}else if(command.equals("ϵͳ����")){
		}else if(command.equals("����ָ��")){
		}else if(command.equals("��������")){
		}
	}

}
