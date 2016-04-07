package tdd;

import java.util.HashMap;

public class Sheet {
	HashMap<String, String> sheetMap;
	HashMap<String,String> literalMap;
	public Sheet() {
		this.sheetMap = new HashMap<>();
		this.literalMap = new HashMap<>();
	}

	public String get(String key) {
		String toReturn = sheetMap.get(key);
		if(toReturn!=null) return toReturn;
		return "";
	}

	public void put(String theCell, String string) {
		try{
			int testInt = Integer.parseInt(string.trim());
			sheetMap.put(theCell, string.trim());
		}
		catch(Exception e){
			sheetMap.put(theCell, string);
		}
		literalMap.put(theCell, string);
	}

	public Object getLiteral(String theCell) {
		return literalMap.get(theCell); 
	}

}
