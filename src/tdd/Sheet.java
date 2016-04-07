package tdd;

import java.util.HashMap;
import java.util.Map;

public class Sheet {

	private Map<String, Cell> map;
	
	public Sheet() {
		map = new HashMap<String, Cell>();
	}

	public String get(String input) {
		Cell val = map.get(input);
		if(val == null) return "";
		return val.getValue();
	}

	public void put(String name, String value) {
		Cell n = new Cell(name, value);
		map.put(name, n);
	}

	public String getLiteral(String theCell) {
		return map.get(theCell).getLiteral();
	}
	
	public static void main(String[] args){
		Sheet s = new Sheet();
		String theCell = "A21";

		s.put(theCell, "Some string");
		String v = s.getLiteral(theCell);
		System.out.println(v);
	}

}
