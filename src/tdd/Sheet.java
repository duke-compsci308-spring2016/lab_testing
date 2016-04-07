package debug;

import java.util.HashMap;
import java.util.Map;

import com.sun.xml.internal.ws.util.StringUtils;

public class Sheet {
	
	Map<String, String> data;
	
	public Sheet() {
		data = new HashMap<String, String>();
	}
	
	public void put(String cell, String value) {
		data.put(cell, value);
	}
	
	public String get(String cell) {
		if (data.containsKey(cell)) {
			String newData = data.get(cell).trim();
			if (newData.length() != 0 && newData.matches("[A-Za-z0-9]+")) {
				return newData;
			} else {
				return data.get(cell);
			}
		} else {
			return "";
		}
	}
	
	public String getLiteral(String cell) {
		if (data.containsKey(cell)) {
			return data.get(cell);
		} else {
			return "";
		}
	}
	
}
