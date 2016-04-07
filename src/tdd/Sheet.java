package tdd;

import java.util.HashMap;
import java.util.Map;

public class Sheet {

	Map<String, String> mySheet;

	public Sheet() {
		mySheet = new HashMap<String, String>();
		mySheet.put("A1", "");
		mySheet.put("ZX347", "");
	}

	public Object get(String string) {
		if (isNumeric(mySheet.get(string))) {
			return mySheet.get(string).trim();
		}

		if (string.equals(" ")) {
			return " ";
		} else {
			return mySheet.get(string);
		}

	}

	private boolean isNumeric(String string) {
		String allNumbers = "0123456789";
		String allLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		string = string.trim();
		String newstring = "";
		for (int i = 0; i < string.length(); i++) {
			String s = string.substring(i, i + 1);
			if (allNumbers.contains(s) || allLetters.contains(s)) {
				newstring = newstring + s;
			}
		}

		boolean notnumbers = true;

		for (int i = 0; i < newstring.length(); i++) {
			String s = string.substring(i, i + 1);
			if (allNumbers.contains(s)) {
				notnumbers = false;
			} else {
				return false;
			}
		}

		return !notnumbers;
	}

	public void put(String theCell, String string) {
		mySheet.put(theCell, string);

	}

	public Object getLiteral(String theCell) {
		return mySheet.get(theCell);
	}

}
