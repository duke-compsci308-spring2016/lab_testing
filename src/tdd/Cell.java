package tdd;

public class Cell {

	private String name;
	private String value;
	private String literal;
	Algorithm alg = new Algorithm();
	
	public Cell(String name, String value) {
		this.name = name;
		this.literal = value;
		this.value = alg.checkValue(value);
	}
	
	public String getName(){
		return name;
	}
	
	public String getLiteral(){
		return literal;
	}
	
	public String getValue(){
		return value;
	}

}
