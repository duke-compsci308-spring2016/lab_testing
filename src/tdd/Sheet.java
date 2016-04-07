package tdd;

import java.util.HashMap;

public class Sheet {
    private HashMap<String,String> myCells = new HashMap<String,String>();
    
    public String get(String string){
        if(myCells.containsKey(string)){
            return trim(myCells.get(string));
        }
        return "";
    }
    
    public void put(String key, String value){
        myCells.put(key, value);
    }

    public String getLiteral(String key){
        if(myCells.containsKey(key)){
            return (myCells.get(key));
        }
        return "";
    }
    private String trim (String value) {
        String regex = "\\s*\\d+\\s*";
        if(value.matches(regex)){
            return value.replaceAll("\\s+", "");
        }
        return value;
    }
}
