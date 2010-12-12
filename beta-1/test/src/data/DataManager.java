package data;

/*
 * 负责存储，读取数据;
 * by郭宏宇
 */
public class DataManager {
	
	public enum Table{book, note};
	
	public DataManager(){
	}
	public void initdatabase(){
		//建好数据库与数据库里面的表
	}
	public void adddata(Table table, String[] values){
		//根据表名与名参数去增加数据
	}
	public String getdata(Table table, int id){
		//根据表名与ID去获取数据
		return null;
	}
	public String search(Table table, String word){
		//通过词语来查到相应的数据
		return null;
	}
	public void updatedata(Table table, int id, String[] values){
		//根据ID去改变相应数据的值
	}
	public void deletedata(Table table, int id){
		//根据ID去删除某一行数据
	}
}
