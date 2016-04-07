package tdd;

import java.util.ArrayList;
import java.util.HashMap;

public class Sheet {
	private HashMap<String,String> stringMap;
	public Sheet(){
		stringMap = new HashMap<String,String>();
	}
	public String get(String string) {
		if (stringMap.get(string)!=null){
			return cleanUpCellInput(stringMap.get(string));
		}return "";
	}

	public void put(String theCell, String string) {
		
		stringMap.put(theCell, string);	
	}
	private String cleanUpCellInput(String theCell) {
		try {
			String newString = Integer.parseInt(theCell.trim()) +  "";
			return newString;
		}
			
		catch (Exception e){
			return theCell;
		}
	}
	public String getLiteral(String theCell) {
		if (stringMap.get(theCell)!=null){
			return stringMap.get(theCell);
		}return "";
	}
}
	


