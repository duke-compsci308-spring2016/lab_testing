package tdd;

import java.util.HashMap;
import java.util.Map;

public class Sheet {
	private Map<String, String> cellToString;
	private Map<String, String> cellToLiteral;
	
	public Sheet(){
		cellToString = new HashMap<String, String>();
		cellToLiteral  = new HashMap<String, String>();
	}
	public String get(String string) {
		if(cellToString.containsKey(string)){
			return cellToString.get(string);
		}
		return "";
	}

	public void put(String theCell, String string) {
		cellToLiteral.put(theCell, string);
		try{
			String stringCopy = string.trim();
			Integer.parseInt(stringCopy);
			string = stringCopy;
		}catch(Exception e){
			
		}
		cellToString.put(theCell, string);
		
	}
	public String getLiteral(String theCell) {
		// TODO Auto-generated method stub
		return cellToLiteral.get(theCell);
	}

}
