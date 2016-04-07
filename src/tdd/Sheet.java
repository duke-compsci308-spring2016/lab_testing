package tdd;

import java.util.HashMap;
import java.util.Map;

public class Sheet {

	Map<String, String> myMap;
	Map<String, String> myInput;
	
	public Sheet() {
		// TODO Auto-generated constructor stub
		myMap = new HashMap<String, String>();
		myInput = new HashMap<String, String>();
	}
	
	public String get(String string){
		if(myMap.get(string) == null) return "";
		else{
			
			return myMap.get(string);
		}
	}

	public void put(String cell, String value){
		myInput.put(cell, value);
		if (isNumeric(value.trim()))
			myMap.put(cell, value.trim());
		else
			myMap.put(cell, value);
	}
	
	
	public String getLiteral(String key){
		return myInput.get(key);
	}
	private boolean isNumeric(String value){
		
		if (value.equals(""))
			return false;
		
		String numbers = "0123456789";
		
		boolean numeric = true;
		
		for(int i=0; i < value.length(); i++) {
			if (!numbers.contains(value.substring(i, i+1))) {
				numeric = false;
			}
		}
		
		return numeric;
	
	}
	
	
	
}
