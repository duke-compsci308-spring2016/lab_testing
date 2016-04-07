package tdd;

import java.util.HashMap;
import java.util.Map;

public class Sheet {
    
    private Map<String, String> myMap = new HashMap<>();

    public String get (String key) {
        if (!myMap.containsKey(key)) {
            return "";
        }
        String value = myMap.get(key);
        if (!value.matches("[ ]+") && value.matches("[0-9 ]+")) {
            value = value.trim();
        }
        return value;
    }

    public void put (String theCell, String value) {
        myMap.put(theCell, value);
    }

    public Object getLiteral (String key) {
        if (!myMap.containsKey(key)) {
            return "";
        }
        return myMap.get(key);
    }

}
