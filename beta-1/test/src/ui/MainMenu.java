package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import control.EventHandleInterface;

/*
 * 主菜单
 *by曹杰聪
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
				{"文件", "最近浏览", "打开", "退出"},
				{"动作", "上一页", "下一页", "自动播放", "添加标签"},
				{"我的书库", "默认列表", "添加列表"},
				{"设置", "字体设置", "皮肤设置", "系统设置"},
				{"帮助", "新手指导", "关于我们"}
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
		if(command.equals("最近浏览")){			
		}else if(command.equals("打开")){
			eventHandler.select_file();
		}else if(command.equals("退出")){
		}else if(command.equals("上一页")){
		}else if(command.equals("下一页")){
		}else if(command.equals("自动播放")){
		}else if(command.equals("添加标签")){
		}else if(command.equals("默认列表")){
		}else if(command.equals("添加列表")){
		}else if(command.equals("字体设置")){
		}else if(command.equals("皮肤设置")){
		}else if(command.equals("系统设置")){
		}else if(command.equals("新手指导")){
		}else if(command.equals("关于我们")){
		}
	}

}
