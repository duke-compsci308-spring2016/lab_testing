package tdd;

public class Algorithm {

	public Algorithm() {
		// TODO Auto-generated constructor stub
	}
	
	public String checkValue(String value){
		String temp = value.trim();
		if(temp.matches("-?\\d+(\\.\\d+)?")){
			return temp;
		} else {
			return value;
		}
	}

	public static void main(String[] args){
		Algorithm a = new Algorithm();
		String input = " 1345 ";
		String input2 = " 99 X";
		String input3 = " ";
		String input4 = "1234";
		System.out.println(a.checkValue(input4));
	}
	
}
