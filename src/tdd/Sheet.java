package tdd;

import java.util.HashMap;
import java.util.Map;

public class Sheet {
	private Map<String,String> myCellArray;
	private Map<String,String> myLiteralCellArray;

	public Sheet(){
		myCellArray = new HashMap<String,String>();
		myLiteralCellArray = new HashMap<String,String>();
	}
	public String get(String s) {
		if( myCellArray.containsKey(s)){return myCellArray.get(s);}
		return "";
	}

	public void put(String theCell, String string) {
		myLiteralCellArray.put(theCell,string);
		String temp = string;
		temp = temp.replaceAll(" ", "");

		System.out.println(temp);
		if(isNumeric(temp)){string = temp;}
		myCellArray.put(theCell, string);
	}
	
	private static boolean isNumeric(String str)
	{
		try{
			int num = Integer.parseInt(str);
			return true;
		}
		catch(NumberFormatException e){
			return false;
		}
	}
	public Object getLiteral(String theCell) {
		return myLiteralCellArray.get(theCell);
	}

}
