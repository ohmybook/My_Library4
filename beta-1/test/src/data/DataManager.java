package data;

/*
 * ����洢����ȡ����;
 * by������
 */
public class DataManager {
	
	public enum Table{book, note};
	
	public DataManager(){
	}
	public void initdatabase(){
		//�������ݿ������ݿ�����ı�
	}
	public void adddata(Table table, String[] values){
		//���ݱ�����������ȥ��������
	}
	public String getdata(Table table, int id){
		//���ݱ�����IDȥ��ȡ����
		return null;
	}
	public String search(Table table, String word){
		//ͨ���������鵽��Ӧ������
		return null;
	}
	public void updatedata(Table table, int id, String[] values){
		//����IDȥ�ı���Ӧ���ݵ�ֵ
	}
	public void deletedata(Table table, int id){
		//����IDȥɾ��ĳһ������
	}
}
