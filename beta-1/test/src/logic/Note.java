package logic;

public class Note {
	private String ID;
	private String text;
	public Note(String text){
		//��Ҫ��ID�ĳ�ʼ��
	}
	public Note(){
		//��������ʱ����ǩ�ĳ�ʼ��
	}
	public String gettext(){
		//��ȡ��ǩ������
		return this.text;
	}
	public void settext(String text){
		//�����޸���ǩ������
		this.text = text;
	}
	public void save(){
		//������ǩ����Ϣ
	}
}
