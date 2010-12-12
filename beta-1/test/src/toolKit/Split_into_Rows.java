package toolKit;

import java.util.ArrayList;

public class Split_into_Rows {
	
	public Split_into_Rows(){
	}
	
	private double totalLengthOfOneRow = 216; 
	public ArrayList<String> divide_into_rows(String paragraph){
		
		ArrayList<String> rowsOfContent = new ArrayList<String>();
		String tempRow = "";
		int tempLengthOfOneRow = 0;
		for(int charCount = 0; charCount < paragraph.length(); charCount++){
			if(tempLengthOfOneRow >= totalLengthOfOneRow){
		        rowsOfContent.add(tempRow);
				tempRow = "";
				tempLengthOfOneRow = 0;
			}
			tempRow += paragraph.charAt(charCount);
			if(paragraph.charAt(charCount) > 256)
				tempLengthOfOneRow += 9;
			else
				tempLengthOfOneRow += 4;
		}
		if(tempLengthOfOneRow != totalLengthOfOneRow)
			rowsOfContent.add(tempRow);
		
		return rowsOfContent;
	}
}
