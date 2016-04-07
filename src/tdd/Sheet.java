package tdd;

import java.util.HashMap;

public class Sheet {
	private HashMap<String, String> myMap;
	public Sheet() {
		// TODO Auto-generated constructor stub
		myMap=new HashMap<String, String>();
	}
	public String get(String string) {
		if(myMap.get(string)==null){
			return "";
		}
		try{
			String copy = "" + myMap.get(string);
			copy = copy.trim();
			Integer.parseInt(copy);	
			return copy;
		} catch (Exception e) {
			return myMap.get(string);
		}
	}
	
	public void put(String key, String value){
		myMap.put(key, value);
	}
	
	public String getLiteral(String key) {
		return myMap.get(key);
	}

}
