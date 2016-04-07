package tdd;

import java.util.HashMap;
import java.util.Map;

public class Sheet {
	
	private Map<String, String> container;
	
	public Sheet(){
		container = new HashMap<>();
	}
	
	public String get(String string){
		if(container.containsKey(string)){
			String data = container.get(string);
			try{
				String temp = data.trim();
				Integer.parseInt(temp);
				return temp;
			}catch(Exception e){
				return data;
			}
		}
		return "";
	}
	
	public void  put(String theCell, String theData){
		container.put(theCell, theData);
	}
	
	public String getLiteral(String string){
		if(container.containsKey(string)){
			return container.get(string);
		}
		return "";
	}

}
