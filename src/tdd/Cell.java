package tdd;

public class Cell {
    private String value="";
    private String numericValue;
    
    public Cell(){
        
    }
    
    public Cell(String value){
        this.value = value;
        if (isInt(value)){
            numericValue = value.trim();
        }
    }
    
    public boolean isInt(String string){
        String s = string.trim();
        if(s.isEmpty()) return false;
        for(int i = 0; i < s.length(); i++) {
            if(i == 0 && s.charAt(i) == '-') {
                if(s.length() == 1) return false;
                else continue;
            }
            if(Character.digit(s.charAt(i),10) < 0) return false;
        }
        return true;
    }
    
    public String get(){
        if (numericValue == null) return value;
        return numericValue;
    }
    
    public String getLiteral(){
        return value;
    }
    
    
}
