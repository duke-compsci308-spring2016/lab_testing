package tdd;

import java.util.HashMap;
import java.util.Map;


public class Sheet {
	public Map<String, String> myMap = new HashMap<>();

	public String get(String string) {
		return myMap.get(string) == null? "" : myMap.get(string);
	}
	
	public void put(String key, String value) {
		try {
			Integer.parseInt(value);
			value = value.trim();
		}
		catch (Exception e) {
		}
		myMap.put(key, value);
	}
}
