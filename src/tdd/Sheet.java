package tdd;

import java.util.HashMap;

public class Sheet {
	HashMap<String, String> myMap = new HashMap<String, String>();
	
	public void put (String key, String val) {
		myMap.put(key, val);
	}
	
	public String get (String key) {
		String val = myMap.get(key);
		String[] valueArray = val.split(" ");
		if (valueArray.length != 1) {
			return val;
		}
		else if (isNumeric(valueArray[0])) {
			return val.trim();
		}
		else {
			return val;
		}
	}
	
	public String getLiteral (String key) {
		return myMap.get(key);
	}
	
	public boolean isNumeric(String s) {
		return s.matches("-?\\d+(\\.\\d+)?");
	}
}
