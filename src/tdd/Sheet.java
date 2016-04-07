package tdd;

import java.util.HashMap;
import java.util.Map;

public class Sheet {

	private Map<String, String> myMap;
	
	public Sheet() {
		myMap = new HashMap<>();
	}
	
	public String get(String string) {
		if(myMap.containsKey(string)) {
			if(isNumeric(myMap.get(string))) {
				return myMap.get(string).trim();
			}
			else {
				return myMap.get(string);
			}
		}
		else {
			return "";
		}
	}

	public void put(String theCell, String string) {
		myMap.put(theCell, string);
	}

	private static boolean isNumeric(String str)  
	{  
		try  
		{  
			double d = Double.parseDouble(str);  
		}  
		catch(NumberFormatException nfe)  
		{  
			return false;  
		}  
		return true;  
	}

	public String getLiteral(String theCell) {
		if(myMap.containsKey(theCell)) {
			return myMap.get(theCell);
		}
		else {
			return "";
		}
	}
}