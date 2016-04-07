package tdd;

import java.util.HashMap;
import java.util.Map;

public class Sheet {
	
	Map<String, String> mySheetMap;

	public Sheet() {
		mySheetMap = new HashMap<String, String>();
	}

	public String get(String string) {
		if ( mySheetMap.get(string) == null)
			return "";
		String retrieved = mySheetMap.get(string);
		if(retrieved.length()>1)
			if(retrieved.substring(0,1).equals(" ") && 
					retrieved.substring(retrieved.length()-1,retrieved.length()).equals(" "))
				return retrieved.trim();
		return retrieved;
	}
	
	public void put(String cell, String string) {
		mySheetMap.put(cell, string);
	}
	
	public String getLiteral(String string) {
		if ( mySheetMap.get(string) == null)
			return "";
		return mySheetMap.get(string);
	}

}
