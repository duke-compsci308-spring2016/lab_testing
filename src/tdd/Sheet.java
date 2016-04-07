package tdd;

import java.util.HashMap;

public class Sheet {

	private HashMap<String, String> myCells = new HashMap<String,String>();
	
	public String get(String string) {
		if(myCells.get(string)!=null){
			try{
				Integer.parseInt(myCells.get(string).trim());
				return myCells.get(string).trim();
			}
			catch(Exception e){
				return myCells.get(string);
			}
		}
		return "";
		

	}
	
	public void put(String cell, String value) {
		myCells.put(cell,value);
	}

	public String getLiteral(String theCell) {
		if(myCells.get(theCell)!=null){
			return myCells.get(theCell);
		}
		return "";
	}

}
