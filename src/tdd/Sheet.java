package tdd;

import java.util.HashMap;
import java.util.Map;

public class Sheet {
	
	public Map<String, String> sheetMap = new HashMap();
	
	public String get(String in){
		if (sheetMap.containsKey(in)){
			String temp = sheetMap.get(in);
	 	    temp = temp.replaceAll(" +", "");
			if (isNumeric(temp)){
				return temp;
			}
			else 
				return sheetMap.get(in);
		}
		else
			return "";
	}
	
	public boolean isNumeric(String s) {  
	    return s.matches("[-+]?\\d*\\.?\\d+");  
	}  
	
	public void put(String key, String mapping){
		sheetMap.put(key, mapping);
	}
	
	public String getLiteral(String in){
		return sheetMap.get(in);
	}
}
