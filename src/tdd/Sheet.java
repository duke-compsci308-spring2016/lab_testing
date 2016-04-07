package tdd;

import java.util.HashMap;
import java.util.Map;

public class Sheet {
	
	private Map<String, String> myMap = new HashMap<>();
	private Map<String, String> literalMap = new HashMap<>();

	public String get(String key) {
		return myMap.get(key);
	}

	public void put(String key, String value) {
		try {
			String trimmed = value.replaceAll("\\s+","");
			int newValue = Integer.parseInt(trimmed);
			myMap.put(key, trimmed);
		}
		catch(Exception E){
			myMap.put(key, value);
		}
		literalMap.put(key, value);
	}
	
	public static void main(String[] arsg){
		Sheet mySheet = new Sheet();
		mySheet.put("A21", " 1234 ");
		System.out.println(mySheet.get("A21"));
	}

	public String getLiteral(String key) {
		return literalMap.get(key);
	}

}
