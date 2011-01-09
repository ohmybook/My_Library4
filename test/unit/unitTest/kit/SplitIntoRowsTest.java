package kit;

import org.junit.*;

import ui.readingarea.ReadingArea;

import java.util.ArrayList;
import java.util.Iterator;



public class SplitIntoRowsTest {
	
	@Test
	public void onlyChineseTest(){
		
		ArrayList<String> testResult ;
		ArrayList<String> expectedResult = new ArrayList<String>() ;
		expectedResult.add("一二三四五");
		expectedResult.add("六七");
		
	    String testString = "一二三四五六七" ;
	    
	    SplitIntoRows  beDivided = new SplitIntoRows();
	    testResult = beDivided.divide_into_rows(testString,100,ReadingArea.readingFont);
	    for(int stringCount = 0; stringCount<testResult.size(); stringCount++)
	    	System.out.println(testResult.get(stringCount));
	    asserChineseEquals(expectedResult,testResult);
	    
	}
	
	@Test
	public void onlyEnglishTest(){
		
		ArrayList<String> testResult = new ArrayList<String>() ;
		ArrayList<String> expectedResult = new ArrayList<String>() ;
		expectedResult.add("abcedenifgr");
		expectedResult.add("rr");
		
	    String testString = "abcedenifgrrr" ;
	    
	    testResult = SplitIntoRows.divide_into_rows(testString,100,ReadingArea.readingFont);
	    for(int stringCount = 0; stringCount<testResult.size(); stringCount++)
	    	System.out.println(testResult.get(stringCount));
	    asserEnglishEquals(expectedResult,testResult);
	    
	}
	
	private void asserEnglishEquals(ArrayList<String> expectedResult,
			ArrayList<String> testResult) {
		// TODO Auto-generated method stub
		Iterator<String> iteratorOfExpectedResult = expectedResult.iterator();
		Iterator<String> iteratorOfTestResult = testResult.iterator();
		for(;iteratorOfExpectedResult.hasNext();) {
			if(!iteratorOfExpectedResult.next().equals(iteratorOfTestResult.next())) {
				System.out.print(" English Test fails !\n");
				return ;
			}
		}
		System.out.print(" English Test successes !\n");
	}

	@Test
	public void chinese_and_englishTest(){
		
		ArrayList<String> testResult ;
		ArrayList<String> expectedResult = new ArrayList<String>() ;
		expectedResult.add("一二cd五fdf");
		expectedResult.add("肯定");
		
	    String testString = "一二cd五fdf肯定" ;
	    
	    SplitIntoRows  beDivided = new SplitIntoRows();
	    testResult = beDivided.divide_into_rows(testString,100,ReadingArea.readingFont);
	    for(int stringCount = 0; stringCount<testResult.size(); stringCount++)
	    	System.out.println(testResult.get(stringCount));
	    asserChineseAndEnglishEquals(expectedResult,testResult);
	    
	}

	private void asserChineseAndEnglishEquals(ArrayList<String> expectedResult,
			ArrayList<String> testResult) {
		// TODO Auto-generated method stub
		Iterator<String> iteratorOfExpectedResult = expectedResult.iterator();
		Iterator<String> iteratorOfTestResult = testResult.iterator();
		for(;iteratorOfExpectedResult.hasNext();) {
			if(!iteratorOfExpectedResult.next().equals(iteratorOfTestResult.next())) {
				System.out.print(" Chinese_And_English Test fails !\n");
				return ;
			}
		}
		System.out.print(" Chinese_And_English Test successes !\n");
	}

	private void asserChineseEquals(ArrayList<String> expectedResult,
			ArrayList<String> testResult) {
		// TODO Auto-generated method stub
		Iterator<String> iteratorOfExpectedResult = expectedResult.iterator();
		Iterator<String> iteratorOfTestResult = testResult.iterator();
		for(;iteratorOfExpectedResult.hasNext();) {
			if(!iteratorOfExpectedResult.next().equals(iteratorOfTestResult.next())) {
				System.out.print(" Chinese Test fails !\n");
				return ;
			}
		}
		System.out.print(" Chinese Test successes !\n");
	}

	@Test
	public void chinese_and_punctuationTest(){
		
		ArrayList<String> testResult ;
		ArrayList<String> expectedResult = new ArrayList<String>() ;
		expectedResult.add("一二三四，");
		expectedResult.add("五");
		
	    String testString = "一二三四，五" ;
	    
	    SplitIntoRows  beDivided = new SplitIntoRows();
	    testResult = beDivided.divide_into_rows(testString,100,ReadingArea.readingFont);
	    for(int stringCount = 0; stringCount<testResult.size(); stringCount++)
	    	System.out.println(testResult.get(stringCount));
	    asserChineseAndPunctuationEquals(expectedResult,testResult);
	    
	}

	private void asserChineseAndPunctuationEquals(
			ArrayList<String> expectedResult, ArrayList<String> testResult) {
		// TODO Auto-generated method stub
		Iterator<String> iteratorOfExpectedResult = expectedResult.iterator();
		Iterator<String> iteratorOfTestResult = testResult.iterator();
		for(;iteratorOfExpectedResult.hasNext();) {
			if(!iteratorOfExpectedResult.next().equals(iteratorOfTestResult.next())) {
				System.out.print(" Chinese_And_Punctuation Test fails !\n");
				return ;
			}
		}
		System.out.print(" Chinese_And_Punctuation Test successes !\n");
	}
	
	@Test
	public void english_and_punctuationTest(){
		
		ArrayList<String> testResult ;
		ArrayList<String> expectedResult = new ArrayList<String>() ;
		expectedResult.add("abc,def。，");
		expectedResult.add("ghi:");
		
	    String testString = "abc,def。，ghi:" ;
	    
	    SplitIntoRows  beDivided = new SplitIntoRows();
	    testResult = beDivided.divide_into_rows(testString,100,ReadingArea.readingFont);
	    for(int stringCount = 0; stringCount<testResult.size(); stringCount++)
	    	System.out.println(testResult.get(stringCount));
	    asserEnglishAndPunctuationEquals(expectedResult,testResult);
	    
	}

	private void asserEnglishAndPunctuationEquals(
			ArrayList<String> expectedResult, ArrayList<String> testResult) {
		// TODO Auto-generated method stub
		Iterator<String> iteratorOfExpectedResult = expectedResult.iterator();
		Iterator<String> iteratorOfTestResult = testResult.iterator();
		for(;iteratorOfExpectedResult.hasNext();) {
			if(!iteratorOfExpectedResult.next().equals(iteratorOfTestResult.next())) {
				System.out.print(" English_And_Punctuation Test fails !\n");
				return ;
			}
		}
		System.out.print(" English_And_Punctuation Test successes !\n");
	}
	
	@Test
	public void punctuationTest(){
		
		ArrayList<String> testResult ;
		ArrayList<String> expectedResult = new ArrayList<String>() ;
		expectedResult.add(",.;'，】;'，【");
		expectedResult.add("）（。、{}[");
		expectedResult.add("。、[");
		
	    String testString = ",.;'，】;'，【）（。、{}[。、[" ;
	    
	    SplitIntoRows  beDivided = new SplitIntoRows();
	    testResult = beDivided.divide_into_rows(testString,100,ReadingArea.readingFont);
	    for(int stringCount = 0; stringCount<testResult.size(); stringCount++)
	    	System.out.println(testResult.get(stringCount));
	    asserPunctuationEquals(expectedResult,testResult);
	    
	}

	private void asserPunctuationEquals(
			ArrayList<String> expectedResult, ArrayList<String> testResult) {
		// TODO Auto-generated method stub
		Iterator<String> iteratorOfExpectedResult = expectedResult.iterator();
		Iterator<String> iteratorOfTestResult = testResult.iterator();
		for(;iteratorOfExpectedResult.hasNext();) {
			if(!iteratorOfExpectedResult.next().equals(iteratorOfTestResult.next())) {
				System.out.print(" Punctuation Test fails !\n");
				return ;
			}
		}
		System.out.print(" Punctuation Test successes !\n");
	}
	
	@Test
	public void chinese_and_english_and_punctuationTest(){
		
		ArrayList<String> testResult ;
		ArrayList<String> expectedResult = new ArrayList<String>() ;
		expectedResult.add("二狗,I will");
		expectedResult.add("fucking kill");
		expectedResult.add("you ！");
		
	    String testString = "二狗,I will fucking kill you ！ " ;
	    
	    SplitIntoRows  beDivided = new SplitIntoRows();
	    testResult = beDivided.divide_into_rows(testString,100,ReadingArea.readingFont);
	    for(int stringCount = 0; stringCount<testResult.size(); stringCount++)
	    	System.out.println(testResult.get(stringCount));
	    asserChineseAndEnglishAndPunctuationEquals(expectedResult,testResult);
	    
	}

	private void asserChineseAndEnglishAndPunctuationEquals(
			ArrayList<String> expectedResult, ArrayList<String> testResult) {
		// TODO Auto-generated method stub
		Iterator<String> iteratorOfExpectedResult = expectedResult.iterator();
		Iterator<String> iteratorOfTestResult = testResult.iterator();
		for(;iteratorOfExpectedResult.hasNext();) {
			if(!iteratorOfExpectedResult.next().equals(iteratorOfTestResult.next())) {
				System.out.print(" Chinese_And_English_And_Punctuation Test fails !\n");
				return ;
			}
		}
		System.out.print(" Chinese_And_English_And_Punctuation Test successes !\n");
	}
	
}
