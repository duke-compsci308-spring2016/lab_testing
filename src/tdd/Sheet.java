package tdd;

import java.util.HashMap;
import java.util.Map;

public class Sheet {
	
	private Map<String, String> myMap;
	
	public Sheet() {
		myMap = new HashMap<>();
	}
	
	public String get(String string) {
		String tempString = myMap.get(string);
		try{
			int test = Integer.parseInt(myMap.get(string).trim());
			return String.valueOf(test);
		} catch (Exception e){
			if (tempString == null) {
				return "";
			}
			return tempString;
		}
	}
	
	public String getLiteral(String key) {
		return myMap.get(key);
	}
	
	public void put(String key, String obj) {
		myMap.put(key, obj);
	}

}
