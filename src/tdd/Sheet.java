package tdd;

import java.util.HashMap;
import java.util.Map;

public class Sheet {
	
	private Map<String, String> mySheet;
	
	public Sheet(){
		mySheet = new HashMap<String, String>();
	}
	
	public String get(String string) {
		// TODO Auto-generated method stub
		String val = mySheet.get(string);
		if(val == null){
			return "";
		}
		return strip(val);
	}

	public void put(String theCell, String string) {
		// TODO Auto-generated method stub
		mySheet.put(theCell, string);
	}
	
	private String strip(String string){
		if(isNumeric(string)){
			return string.trim();
		}
		return string;
	}
	
	private boolean isNumeric(String s) {  
	    return s.matches("\\s+[-+]?\\d+\\.?\\d+\\s+");
	}

	public Object getLiteral(String theCell) {
		// TODO Auto-generated method stub
		String val = mySheet.get(theCell);
		if(val == null){
			return "";
		}
		return val;
	}
	

}

