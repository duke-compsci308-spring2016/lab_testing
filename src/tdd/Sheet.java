package tdd;

import java.util.HashMap;
import java.util.Map;

public class Sheet {
	
	private Map<String, String> map;
	private Map<String, String> literals;
	public Sheet(){
		map = new HashMap<String, String>();
		literals = new HashMap<String, String>();
	}
	public String get(String string){
		return map.getOrDefault(string, "");
	}
	public void put(String theCell, String value){
		literals.put(theCell, value);
		if(value.trim().matches("^[0-9]+$")){
			map.put(theCell, value.trim());
			return;
		}
		map.put(theCell, value);
	}
	public String getLiteral(String string){
		return literals.get(string);
	}
}
