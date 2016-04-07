package tdd;

import java.util.HashMap;
import java.util.Map;

public class Sheet {
	Map<String, String> myData;
	
	public Sheet() {
		myData = new HashMap<String, String>();
	}
	
	public String get(String string) {
		String str = getStringFromSheet(string);
		for (int i = 0; i < str.length(); i++) {
			String s = str.substring(i, i+1);
			if (!"0123456789 ".contains(s)) {
				return str;
			}
		}
		if (str.trim().equals("")) {
			return str;
		} else {
			return str.trim();
		}
	}

	private String getStringFromSheet(String string) {
		String str = myData.get(string) != null ? myData.get(string) : "";
		return str;
	}

	public void put(String theCell, String string) {
		myData.put(theCell, string);
	}

	public String getLiteral(String theCell) {
		return getStringFromSheet(theCell);
	}
}
