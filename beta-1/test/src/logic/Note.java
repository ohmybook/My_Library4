package logic;

public class Note {
	private String ID;
	private String text;
	public Note(String text){
		//还要对ID的初始化
	}
	public Note(){
		//程序启动时对书签的初始化
	}
	public String gettext(){
		//获取书签的内容
		return this.text;
	}
	public void settext(String text){
		//用于修改书签的内容
		this.text = text;
	}
	public void save(){
		//保存书签的信息
	}
}
