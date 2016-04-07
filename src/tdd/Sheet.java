package tdd;

import java.util.HashMap;
import java.util.Map;

public class Sheet {
	
	private Map<String, String> sheetMap;
	
	public Sheet() {
		this.sheetMap = new HashMap<String, String>();
	}

	public String get(String theCell) {
		if(this.sheetMap.containsKey(theCell)) {
			String testIfNumber = this.sheetMap.get(theCell).replace(" ", "");
			try {
				Integer.parseInt(testIfNumber);
				return testIfNumber;
			} catch(NumberFormatException e) {
				return this.sheetMap.get(theCell);
			}
		}
		return "";
	}

	public void put(String theCell, String string) {
		this.sheetMap.put(theCell, string);
	}

	public String getLiteral(String theCell) {
		return this.sheetMap.get(theCell);
	}

}
