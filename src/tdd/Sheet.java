package tdd;
import java.util.ArrayList;
import java.util.HashMap;

public class Sheet {
	HashMap<String, String> posToString;
	
	public Sheet(){
		posToString = new HashMap<String,String>();
	}
	
	public String get(String s){
		if (!posToString.keySet().contains(s)){
			return "";
		}
		String result = posToString.get(s);
		String trimmed_result = result.trim();
		try{
			Integer.parseInt(trimmed_result);
			return trimmed_result;
		}catch (NumberFormatException e){
			return result;
		}
	}
	
	public void put(String pos, String content){
		posToString.put(pos, content);
	}
	
	public String getLiteral(String pos){
		if (posToString.keySet().contains(pos)){
			return posToString.get(pos);
		}
		return "";
	}
}
