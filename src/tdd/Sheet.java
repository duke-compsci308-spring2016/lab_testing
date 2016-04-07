package tdd;

import java.util.HashMap;

public class Sheet {
	
	HashMap<String, String> cellStorage = new HashMap<String, String>();
	HashMap<String, String> literals = new HashMap<String, String>();
	
	public String get(String string) {
		if(!cellStorage.keySet().contains(string)){
			return "";
		}
		return cellStorage.get(string);
	}
	
	public void put(String cell, String string){
		literals.put(cell, string);
		try{
			Integer.parseInt(string.trim());
		} catch (Exception e){
			cellStorage.put(cell, string);
			return;
		}
		cellStorage.put(cell, string.trim());
	}
	
	public String getLiteral(String string){
		if(!literals.keySet().contains(string)){
			return "";
		}
		return literals.get(string);
	}

}
