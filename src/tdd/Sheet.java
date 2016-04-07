package tdd;

import java.util.HashMap;
import java.util.Map;



public class Sheet {
	
	private Map<String, String> mySheet = new HashMap();
	
	public String get(String string){
		
		if(mySheet.get(string) == null){
			return "";
		}
		
		String tempString = mySheet.get(string).replace(" ", "");
		
		boolean numeric = true;
		if(tempString.isEmpty()){
			return mySheet.get(string);
		}
		for(char c: tempString.toCharArray()){
			if(!Character.isDigit(c)){
				numeric = false;
			}
		}
		if(numeric){
			return tempString;
		}
		return mySheet.get(string);
		
		
	}
	
	public void put(String cellName, String cellContents){
		
		mySheet.put(cellName, cellContents);
	}
	
	public String getLiteral(String cellName){
		return mySheet.get(cellName);
	}
}
