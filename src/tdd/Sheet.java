package src.tdd;

import java.util.HashMap;
import java.util.Map;

public class Sheet {

	private Map<String, String> spreadsheet;
	
	public Sheet() {
		spreadsheet = new HashMap<String, String>();
	}
	
	public String get(String string) {
		String str = spreadsheet.get(string);
		if(str == null) {
			return "";
		}
		try {
			String trim = str.trim();
			Integer.parseInt(trim);
			return trim;
		} catch(NumberFormatException e) {
			return str;
		}
	}

	public void put(String cell, String value) {
		spreadsheet.put(cell, value);
	}
	
	public String getLiteral(String cell) {
		return spreadsheet.get(cell);
	}
	
}
