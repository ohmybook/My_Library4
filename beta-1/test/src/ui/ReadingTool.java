package ui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import control.EventHandleInterface;

public class ReadingTool extends JLabel implements ActionListener{
	EventHandleInterface eventHandler;
	public ReadingTool(EventHandleInterface eventHandler){
		super();
		initialize();
		initialize_buttons();
		this.eventHandler = eventHandler;
	}

	private void initialize() {
		this.setBounds(350, 590, 320, 40);
		this.setBackground(Color.darkGray);
		this.setOpaque(true);
	}

	JButton buttons[] = new JButton[3];
	private void initialize_buttons() {
		buttons[0] = new JButton("��һҳ");
		buttons[1] = new JButton("�Զ���ҳ");
		buttons[2] = new JButton("��һҳ");
		for(int perButton = 0; perButton < 3; perButton++){
			buttons[perButton].setBounds(10 + perButton * 100 + (perButton==2?20:0), 5, perButton%2==0?80:100, 30);
			buttons[perButton].addActionListener(this);
			this.add(buttons[perButton]);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="��һҳ"){
			eventHandler.back_to_the_previous_page();
		}else if(e.getActionCommand()=="��һҳ"){
			eventHandler.go_to_the_next_page();
		}
	}
}
