package sheet;

import java.util.Map;
import java.util.TreeMap;

public class Sheet {
	
	private Map<String, String> spreadSheet;
	private Map<String, String> literalSheet;
	
	public Sheet(){
		spreadSheet = new TreeMap<String, String>();
		literalSheet = new TreeMap<String, String>();
	}
	public String get(String string) {
		if(spreadSheet.containsKey(string))
			return spreadSheet.get(string);
		else
			return "";
	}

	public void put(String theCell, String string) {
		
		literalSheet.put(theCell, string);

		if (string.matches(".*[a-zA-Z]+.*")|| !string.matches(".*[0-9]+.*")){
			spreadSheet.put(theCell, string);
		}
		else{
			string = string.replaceAll("\\s+","");
			spreadSheet.put(theCell, string);
		}
		
	}
	public String getLiteral(String theCell) {
		return literalSheet.get(theCell);
	}
	
}
